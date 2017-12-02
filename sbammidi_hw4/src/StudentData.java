//Author: Sameera Bammidi
// This class contains data which stored into the database table.
import java.io.Serializable;
import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.persistence.*;
@ManagedBean
@Entity
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
	private Date dateOfSurvey;
	private String campusManyCheckbox;
	private String interestSelectOneRadio;
	private String likelihoodSelectOneMenu;
	private String raffle;
	private String additionalComments;
	private Date possibleStartDate;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	public StudentData(){}

	public StudentData(String firstName, String lastName, String streetAddress, String city, String state, 
			String zip, String telephoneNumber, String email, Date dateOfSurvey, Date possibleStartDate, 
			String checkBox, String radio, String oneMenu, String raffle, String comments)
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
		this.setPossibleStartDate(possibleStartDate);
		this.setCampusManyCheckbox(checkBox);
		this.setInterestSelectOneRadio(radio);
		this.setLikelihoodSelectOneMenu(oneMenu);
		this.setRaffle(raffle);
		this.setAdditionalComments(comments);
	}

	

	@Override
	public String toString()
	{
		return "StudentData [firstName=" + firstName + ", lastName=" + lastName
				+ ", streetAddress=" + streetAddress + ", city=" + city
				+ ", state=" + state + ", zip=" + zip + ", telephoneNumber="
				+ telephoneNumber + ", email=" + email + ", dateOfSurvey="
				+ dateOfSurvey + ", campusManyCheckbox=" + campusManyCheckbox
				+ ", interestSelectOneRadio=" + interestSelectOneRadio
				+ ", likelihoodSelectOneMenu=" + likelihoodSelectOneMenu
				+ ", raffle=" + raffle + ", possibleStartDate="
				+ possibleStartDate + ", id=" + id + "]";
	}

	//@Id
	//@Column(name="S_ID", nullable=false, columnDefinition="long")
	public long getId()
	{
		return id;
	}
	//@Column(name="First_Name", nullable=false, length=255)
	public String getFirstName()
	{
		return firstName;
	}
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	//@Column(name="Last_Name", nullable=false, length=255)
	public String getLastName()
	{
		return lastName;
	}
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	//@Column(name="Street_Address", nullable=false, length=500)
	public String getStreetAddress()
	{
		return streetAddress;
	}
	public void setStreetAddress(String address)
	{
		this.streetAddress = address;
	}
	//@Column(name="City", nullable=false, length=255)
	public String getCity()
	{
		return city;
	}
	public void setCity(String city)
	{
		this.city = city;
	}
	//@Column(name="State", nullable=false, length=255)
	public String getState()
	{
		return state;
	}
	public void setState(String state)
	{
		this.state = state;
	}
	//@Column(name="Zip", nullable=false, length=255)
	public String getZip()
	{
		return zip;
	}
	public void setZip(String zip)
	{
		this.zip = zip;
	}
	//@Column(name="Telephone", nullable=false, length=255)
	public String getTelephoneNumber()
	{
		return telephoneNumber;
	}
	public void setTelephoneNumber(String telephone)
	{
		this.telephoneNumber = telephone;
	}
	//@Column(name="Email", nullable=false, length=255)
	public String getEmail()
	{
		return email;
	}
	public void setEmail(String email)
	{
		this.email = email;
	}
	//@Column(name="Date_of_Survey", nullable=false, length=255)
	public Date getDateOfSurvey()
	{
		return dateOfSurvey;
	}
	public void setDateOfSurvey(Date date)
	{
		this.dateOfSurvey = date;
	}
	//@Column(name="Sem_Start_Date", nullable=false, length=255)
	public Date getPossibleStartDate()
	{
		return possibleStartDate;
	}
	public void setPossibleStartDate(Date startDate)
	{
		this.possibleStartDate = startDate;
	}
	//@Column(name="Campus_Likes", nullable=false, length=255)
	public String getCampusManyCheckbox()
	{
		return this.campusManyCheckbox;
	}
	public void setCampusManyCheckbox(String campusManyCheckbox)
	{
		this.campusManyCheckbox = campusManyCheckbox;
	}
	//@Column(name="Campus_Interest", nullable=false, length=255)
	public String getInterestSelectOneRadio()
	{
		return interestSelectOneRadio;
	}
	public void setInterestSelectOneRadio(String interestSelectOneRadio)
	{
		this.interestSelectOneRadio = interestSelectOneRadio;
	}
	//@Column(name="Likelihood", nullable=false, length=255)
	public String getLikelihoodSelectOneMenu()
	{
		return likelihoodSelectOneMenu;
	}
	public void setLikelihoodSelectOneMenu(String likelihoodSelectOneMenu)
	{
		this.likelihoodSelectOneMenu = likelihoodSelectOneMenu;
	}
	//@Column(name="Raffle", nullable=false, length=255)
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
