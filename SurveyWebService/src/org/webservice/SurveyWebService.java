package org.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;


@WebService
public interface SurveyWebService {

	//TODO: return list of surveys based on the search
	@WebMethod(operationName="listStudent")
	public String listStudent(@WebParam(name="firstName") String firstName,
			@WebParam(name="lastName") String lastName,
			@WebParam(name="city") String city,
			@WebParam(name="state") String state);
}
