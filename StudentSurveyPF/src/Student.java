// Sameera Bammidi
// This class has all the matching fields to the Survey.xhtml

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@ManagedBean
@RequestScoped
public class Student
{
	private String firstName;
	private String lastName;
	private String streetAddress;
	private String city;
	private String state;
	private String zip;
	private String telephoneNumber;
	private String email;
	private Date dateOfSurvey;
	private List<String> campusManyCheckbox;
	private String interestSelectOneRadio;
	private String likelihoodSelectOneMenu;
	private String raffle;
	private String additionalComments;
	private Date possibleStartDate;
	//private String cityAndState;

	public List<String> completeText(String query)
	{
		List<String> results = new ArrayList<String>();
		String[] text = {"Very Likely", "Likely", "Unlikely"};
		for(int i = 0; i < 3; i++)
		{
			results.add(text[i]);
		}

		return results;
	}

	public Student()
	{}

	public String getFirstName()
	{
		return firstName;
	}
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	public String getLastName()
	{
		return lastName;
	}
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}

	public String getStreetAddress()
	{
		return streetAddress;
	}
	public void setStreetAddress(String address)
	{
		this.streetAddress = address;
	}

	public String getCity()
	{
		return city;
	}
	public void setCity(String city)
	{
		this.city = city;
	}

	public String getState()
	{
		return state;
	}
	public void setState(String state)
	{
		this.state = state;
	}

	public String getZip()
	{
		return zip;
	}
	public void setZip(String zip)
	{
		this.zip = zip;
		
		Client client = ClientBuilder.newClient();
        WebTarget target = client.target("http://ec2-35-160-12-248.us-west-2.compute.amazonaws.com/StudentSurveyPF/resources/MyRestService/");
   
        WebTarget resourceWebTarget;
        resourceWebTarget = target.path(this.zip);
               
        Invocation.Builder invocationBuilder;
        invocationBuilder = resourceWebTarget.request(MediaType.TEXT_PLAIN);
        System.out.println(resourceWebTarget.getUri());
        Response response = invocationBuilder.get();
        System.out.println(response.getStatus());
        
        String s = response.readEntity(String.class);
        setCity(s.split("-")[0]);
        setState(s.split("-")[1]);        
	}

	public String getTelephoneNumber()
	{
		return telephoneNumber;
	}
	public void setTelephoneNumber(String telephone)
	{
		this.telephoneNumber = telephone;
	}

	public String getEmail()
	{
		return email;
	}
	public void setEmail(String email)
	{
		this.email = email;
	}

	public Date getDateOfSurvey()
	{
		return dateOfSurvey;
	}
	public void setDateOfSurvey(Date date)
	{
		this.dateOfSurvey = date;
	}

	public Date getPossibleStartDate()
	{
		return possibleStartDate;
	}
	public void setPossibleStartDate(Date startDate)
	{
		this.possibleStartDate = startDate;
	}

	public List<String> getCampusManyCheckbox()
	{
		return campusManyCheckbox;
	}
	public void setCampusManyCheckbox(List<String> campusManyCheckbox)
	{
		this.campusManyCheckbox = campusManyCheckbox;
	}

	public String getInterestSelectOneRadio()
	{
		return interestSelectOneRadio;
	}
	public void setInterestSelectOneRadio(String interestSelectOneRadio)
	{
		this.interestSelectOneRadio = interestSelectOneRadio;
	}

	public String getLikelihoodSelectOneMenu()
	{
		return likelihoodSelectOneMenu;
	}
	public void setLikelihoodSelectOneMenu(String likelihoodSelectOneMenu)
	{
		this.likelihoodSelectOneMenu = likelihoodSelectOneMenu;
	}

	public String getRaffle()
	{
		return raffle;
	}
	public void setRaffle(String raffle)
	{
		this.raffle = raffle;
	}

	public String getAdditionalComments()
	{
		return additionalComments;
	}
	public void setAdditionalComments(String comments)
	{
		this.additionalComments = comments;
	}

	private WinningResult winner = new WinningResult();

	public WinningResult getWinner()
	{
		return winner;
	}

	public void setWinner(WinningResult winner)
	{
		this.winner = winner;
	}

	// This method has the Winning result values to compute the value and 
	// returns a string containing the result page name.
	public String submit()
	{
		StudentData studentData = new StudentData(firstName, lastName, streetAddress, city, state, zip, 
				telephoneNumber, email, dateOfSurvey, possibleStartDate, campusManyCheckbox, interestSelectOneRadio, 
				likelihoodSelectOneMenu, raffle, additionalComments);

		AllStudentData.allData.add(studentData);

		FacesContext context = FacesContext.getCurrentInstance();

		if (getRaffle().equals(""))
		{
			context.addMessage(null,
					new FacesMessage("No numbers entered"));
		}

		winner.setMean(StudentService.getMean(this.raffle));

		winner.setStandardDeviation(StudentService.getStandardDeviation(this.raffle));
		String[] numbers = this.raffle.split("\\s*,\\s*");
		if ((winner.getMean()) > 90 && (numbers.length>=10))
		{
			return("WinnerAcknowledgement");
		}

		return("SimpleAcknowledgement");
	}
	public String takeSurvey()
	{
		return("Survey");
	}
	public String listSurvey()
	{
		return("ListSurvey");
	}
	public String home()
	{
		return("MainPage");
	}
	public String reset()
	{
		return (null);
	}
	/*public String getCityAndState()
	{
		ClientConfig config = new ClientConfig();
		Client client = ClientBuilder.newClient(config);
		WebTarget target = client.target(getBaseURI());
		String cityAndState = target.path("{zip}").resolveTemplate("zip", zip).request().get(String.class);
		this.cityAndState = cityAndState;
		return cityAndState;
	}*/	
	/*private static URI getBaseURI()
	{
		return UriBuilder.fromUri("http://localhost:8080/StudentSurveyPF/rest/RestfulService").build();
	}*/
}
