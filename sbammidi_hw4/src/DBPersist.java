//Author: Sameera Bammidi
// This class contains the implementation to persist the data into the database.

import javax.persistence.*;

public class DBPersist
{
	public static final EntityManagerFactory entityManagerFactory =  Persistence.createEntityManagerFactory("StudentDataPersistence");

	public DBPersist()
	{
		super();
	}
	
	public static EntityManager getEntityManager()
	{
		EntityManager em = entityManagerFactory.createEntityManager();
		return em;
	}
	
	public static void persistData(StudentData student)
    {
        EntityManager etm = getEntityManager();        
        etm.getTransaction().begin();        
        etm.persist(student);
        
        // Commit the transaction, which will cause the entity to
        // be stored in the database
        etm.getTransaction().commit();
        // It is always good practice to close the EntityManager so that
        // resources are conserved.
        etm.close();
    }
}
