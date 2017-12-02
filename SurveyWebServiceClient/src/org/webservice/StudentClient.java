// Author: Sameera Bammidi
// This class contains the logic to call the service class search and list method which 
// in turn returns the records from Amazon RDS.
package org.webservice;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.bean.*;

@ManagedBean
@SessionScoped
public class StudentClient
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
	private String[] campusManyCheckbox;
	private String interestSelectOneRadio;
	private String likelihoodSelectOneMenu;
	private String raffle;
	private Date possibleStartDate;

	public String choice = "VeryLikely,Likely,UnLikely";
	public String[] choicearray = choice.split(",");

	private List<StudentData> studentList = new ArrayList<StudentData>();

	public List<String> completeText(String query)
	{
		List<String> queried = new ArrayList<String>(); 
		for(String i: choicearray)
		{
			if(i.toUpperCase() .startsWith(query.toUpperCase()))
			{
				queried.add(i);
			}
		}
		return queried;
	}

	public StudentClient(){}

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
	public List<StudentData> getStudentList()
	{
		return studentList;
	}
	public void search() throws RemoteException
	{
		SurveyWebServiceImplService surveyWebServiceImplService = new SurveyWebServiceImplService();
		SurveyWebService surveyWebService = surveyWebServiceImplService.getSurveyWebServiceImplPort();
		
		List<StudentData> studentDataList = surveyWebService.listStudent(this.getFirstName(), 
				this.getLastName(), this.getCity(), this.getState());
		studentList = studentDataList;
	}
}
