//Author: Sameera Bammidi
// This class contains data which is used for search, delete and list surveys.
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.*;
import javax.faces.context.FacesContext;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.criteria.*;

@ManagedBean
@ViewScoped
public class SearchSurveys implements Serializable
{
	private static final long serialVersionUID = 3937081554174254100L;
	public static ArrayList<StudentData> allData = new ArrayList<StudentData>();
	public static List<StudentData> searchedData = new ArrayList<StudentData>();
	private String firstName;
	private String lastName;
	private String city;
	private String state;
	private List<StudentData> results ;
	
	ArrayList<StudentData> studentList;

	public ArrayList<StudentData> getStudentList()
	{
		return studentList;
	}		
	public void setStudentList(ArrayList<StudentData> studentList)
	{
		this.studentList = studentList;
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

	public List<StudentData> getAllStudentData()
	{
		return allData;
	}
	public void search()
	{
		System.out.println("--------- > search method called");
		
		EntityManager e = DBPersist.getEntityManager();
		
		CriteriaBuilder builder = e.getCriteriaBuilder();
	    CriteriaQuery<StudentData> criteria = builder.createQuery(StudentData.class);

	    Root<StudentData> studentData = criteria.from(StudentData.class);
	    
	    List<Predicate> predicates = new ArrayList<Predicate>();
	    if(!(firstName.trim().equals("")))
	    {
	    	predicates.add(builder.equal(studentData.get("firstName"), getFirstName()));
	    }
	    
	    if(!(lastName.trim().equals("")))
	    {
	    	predicates.add(builder.equal(studentData.get("lastName"), getLastName()));
	    }
	     
	    if(!(city.trim().equals("")))
	    {
	    	predicates.add(builder.equal(studentData.get("city"), getCity()));
	    }
	    if(!(state.trim().equals("")))
	    {	
	    	predicates.add(builder.equal(studentData.get("state"), getState()));
	    }
	      
	    criteria.select(studentData).where(predicates.toArray(new Predicate[]{}));
	    studentList = (ArrayList<StudentData>) e.createQuery(criteria).getResultList();
		e.close();
		/*String concatinatedValues = firstName.concat(",").concat(lastName)
				.concat(",").concat(city).concat(",").concat(state);
		concatinatedValues.replace(",,", ",#,");

		String[] tokens = concatinatedValues.split(",");
		// While the flag is true, look for data from all the fields.
		// 0: firstname 1:lastname 2:city 3:state
		ArrayList<Integer> relevantIndices = new ArrayList<Integer>();
		for(int i=0;i<tokens.length;i++)
		{
			if(!tokens[i].equals("#"))
			{
				relevantIndices.add(i);
			}
		}
		for(StudentData sd: allData)
		{
			String recordString = sd.getFirstName()+","+sd.getLastName()+","+ sd.getCity()+","+sd.getState() ;
			String searchString = concatinatedValues;	
			String[] tokens2 = recordString.split(",");
			String matchString ="";
			for(int i=0;i<4;i++)
			{
				if(relevantIndices.contains(i))
				{
					matchString+=(","+ tokens2[i]);
				}
				else
				{
					matchString+=(",#");
				}
			}
			matchString.replaceFirst(",", "");

			//if(tokens[0].equals(sd.getFirstName()) || tokens[1].equals(sd.getLastName()))
			if(matchString.equals(searchString))
			{
				//if found, search if it contains the mentioned last name, city, and zip if they are not null and
				// add all the records with the similar first name to the list of foundSurveys 
				searchedData.add(sd);
			}
		}*/
	}
	
	public void deleteLink()
	{
		//System.out.println("===> inside deleteLink() ");
		Map<String,String> params = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap();
		//System.out.println("===> inside deleteLink() param map is : "+ params.toString());
		String data =  params.get("idString");
		System.out.println("===> inside deleteLink() data is "+data);
		EntityManager em = DBPersist.getEntityManager();
		long id = Integer.parseInt(data);
		StudentData studentToDelete = em.find(StudentData.class, id);
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		em.remove(studentToDelete);
		transaction.commit();
		em.close();
		
		int i = 0;
		for(i = 0 ; i< this.studentList.size() ; i++){
			if(this.studentList.get(i).getId()==id)
				{
				this.studentList.remove(i);
				break;
				}
		}
		
	}	
	
	public List<StudentData> getListAll()
	{
		EntityManager e = DBPersist.getEntityManager();
	    CriteriaBuilder builder = e.getCriteriaBuilder();
	    CriteriaQuery<StudentData> criteria = builder.createQuery(StudentData.class);
	   
	    Root<StudentData> studentData = criteria.from(StudentData.class);
	    
	    List<Predicate> predicates = new ArrayList<Predicate>();
	   	      
	    criteria.select(studentData).where(predicates.toArray(new Predicate[]{}));
	    results = (ArrayList<StudentData>) e.createQuery(criteria).getResultList();
		
		return results;
	}	
}
