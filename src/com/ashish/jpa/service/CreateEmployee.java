package com.ashish.jpa.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ashish.jpa.model.Employee;

public class CreateEmployee {
	
	public static void main(String args[]){
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("Ashish_JPA");
		EntityManager entitymanager = emfactory.createEntityManager();

		// begin the transaction...
		entitymanager.getTransaction().begin();
		
		//setting up the employee object
		Employee employee = new Employee();
		employee.setEid(102);
		employee.setEname("Peter");
		employee.setSalary(2500);
		employee.setDeg("B.Tech");
		
		// persisting the object...
		entitymanager.persist(employee);
		entitymanager.getTransaction().commit();	
		
		// closing the entity manager and entity manager factory...
		entitymanager.close();
		emfactory.close();
	}

}