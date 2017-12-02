// This class contains data which can be rendered by the ListSurvey.xml
// This class has a parameterized constructors which uses the setters to populate the form fields.
import java.io.Serializable;
import java.util.Arrays;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean
@ApplicationScoped
public class StudentData implements Serializable
{
	private static final long serialVersionUID = 5750989948886340890L;
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

	public StudentData(){}

	public StudentData(String firstName, String lastName, String streetAddress, String city, 
			String state, String zip, String telephoneNumber, String email, String dateOfSurvey, 
			String[] checkBox, String radio, String oneMenu, String raffle, String comments)
	{
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setStreetAddress(streetAddress);
		this.setCity(city);
		this.setState(state);
		this.setZip(zip);
		this.setTelephoneNumber(telephoneNumber);
		this.setEmail(email);
		this.setDateOfSurvey(dateOfSurvey);
		this.setCampusManyCheckbox(checkBox);
		this.setInterestSelectOneRadio(radio);
		this.setLikelihoodSelectOneMenu(oneMenu);
		this.setRaffle(raffle);
		this.setAdditionalComments(comments);
	}

	@Override
	public String toString() {
		return "StudentData [firstName= " + firstName + ", lastName= " + lastName
				+ ", streetAddress= " + streetAddress + ", city= " + city
				+ ", state= " + state + ", zip= " + zip + ", telephoneNumber= "
				+ telephoneNumber + ", email= " + email + ", dateOfSurvey= "
				+ dateOfSurvey + ", campusManyCheckbox= "
				+ Arrays.toString(campusManyCheckbox)
				+ ", interestSelectOneRadio= " + interestSelectOneRadio
				+ ", likelihoodSelectOneMenu= " + likelihoodSelectOneMenu
				+ ", raffle= " + raffle + ", additionalComments= "
				+ additionalComments + "]" + "\n";		
	}
	
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
}
