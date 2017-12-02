package com.main;
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
}
