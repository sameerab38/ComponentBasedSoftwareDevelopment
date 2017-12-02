package org.webservice;

import javax.jws.WebService;

@WebService(endpointInterface="org.webservice.SurveyWebService")
public class SurveyWebServiceImpl implements SurveyWebService{

	//TODO: return the list of the students here
	public String listStudent(String firstName,String lastName,String city,String state){
		return firstName+" "+lastName+" "+city+ ""+state;
	}

}
