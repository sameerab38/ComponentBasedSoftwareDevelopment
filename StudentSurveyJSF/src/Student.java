// Sameera Bammidi
// This class has all the matching fields to the Survey.xhtml

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean
(name="student")
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
	private String dateOfSurvey;
	private String[] campusManyCheckbox;
	private String interestSelectOneRadio;
	private String likelihoodSelectOneMenu;
	private String raffle;
	private String additionalComments;

	//ArrayList<StudentData> studentDataList = new ArrayList<StudentData>();

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

	public String getDateOfSurvey()
	{
		return dateOfSurvey;
	}
	public void setDateOfSurvey(String date)
	{
		this.dateOfSurvey = date;
	}

	public String[] getCampusManyCheckbox()
	{
		return campusManyCheckbox;
	}
	public void setCampusManyCheckbox(String[] campusManyCheckbox)
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
				telephoneNumber, email, dateOfSurvey, campusManyCheckbox, interestSelectOneRadio, 
				likelihoodSelectOneMenu, raffle, additionalComments);

		AllStudentData.allData.add(studentData);

		// Populate studentDataList here.
		// studentDataList.add(studentData);

		FacesContext context = FacesContext.getCurrentInstance();

		if (getRaffle().equals(""))
		{
			context.addMessage(null,
					new FacesMessage("No numbers entered"));
		}

		//WinningResult winningResult = new WinningResult();

		winner.setMean(StudentService.getMean(this.raffle));
		//System.out.println(StudentService.getMean(this.raffle));
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
}
