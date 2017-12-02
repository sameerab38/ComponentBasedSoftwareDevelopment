package com.main;
import java.util.ArrayList;
import java.util.List;

import javax.jws.*;
import javax.persistence.EntityManager;
import javax.persistence.criteria.*;

@WebService()
public class SearchSOAPClass
{
	@WebMethod
	@WebResult(partName="collectionOfStrings")
	public StudentData[] getCollectionOfSearchStrings(@WebParam(partName="fName") String firstName,
			@WebParam(partName="lName") String lastName, @WebParam(partName="city") String city,
			@WebParam(partName="state") String state)
	{

		StudentData[] studentList;

		EntityManager e = DBPersist.getEntityManager();
		CriteriaBuilder builder = e.getCriteriaBuilder();
	    CriteriaQuery<StudentData> criteria = builder.createQuery(StudentData.class);

	    Root<StudentData> studentData = criteria.from(StudentData.class);
	    
	    List<Predicate> predicates = new ArrayList<Predicate>();
	    if(!(firstName.trim().equals("")))
	    {
	    	predicates.add(builder.equal(studentData.get("firstName"), firstName));
	    }
	    
	    if(!(lastName.trim().equals("")))
	    {
	    	predicates.add(builder.equal(studentData.get("lastName"), lastName));
	    }
	     
	    if(!(city.trim().equals("")))
	    {
	    	predicates.add(builder.equal(studentData.get("city"), city));
	    }
	    if(!(state.trim().equals("")))
	    {	
	    	predicates.add(builder.equal(studentData.get("state"), state));
	    }
	      
	    criteria.select(studentData).where(predicates.toArray(new Predicate[]{}));
	    ArrayList<StudentData> obtainedData = (ArrayList<StudentData>) e.createQuery(criteria).getResultList();
	    
	    System.out.println("=========>obtainedData" + obtainedData.toString());
	    
	    studentList = obtainedData.toArray(new StudentData[obtainedData.size()]);
	    
	    System.out.println("============>studentList " + studentList.toString());
		e.close();
		return studentList;
	}
	
}
