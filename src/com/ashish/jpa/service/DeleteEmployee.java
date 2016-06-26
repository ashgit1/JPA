package com.ashish.jpa.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ashish.jpa.model.Employee;

public class DeleteEmployee {

	public static void main(String[] args) {

		EntityManagerFactory emfactory =  Persistence.createEntityManagerFactory("Ashish_JPA");
		EntityManager entitymanager =  emfactory.createEntityManager();
		
		// begin the transaction...
		entitymanager.getTransaction().begin();
		
		// get the employee which needs to be deleted...
		Employee employee = entitymanager.find(Employee.class, 102);
		entitymanager.remove(employee);
		entitymanager.getTransaction().commit();
		
		// close the entity factory and entity manager factory...
		entitymanager.close();
		emfactory.close();
	}

}
