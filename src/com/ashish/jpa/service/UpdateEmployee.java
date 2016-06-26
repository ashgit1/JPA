package com.ashish.jpa.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ashish.jpa.model.Employee;

public class UpdateEmployee {

	public static void main(String[] args) {

		EntityManagerFactory emfactory =  Persistence.createEntityManagerFactory("Ashish_JPA");
		EntityManager entitymanager = emfactory.createEntityManager();
		
		// begin the transaction...
		entitymanager.getTransaction().begin();
		Employee employee = entitymanager.find(Employee.class, 101);
		
		// Before update...
		System.out.println(employee.toString());
		
		// update the employee details...
		employee.setSalary(3500);
		entitymanager.getTransaction().commit();
		
		// after update...
		System.out.println(employee.toString());
		
		// close the connection...
		entitymanager.close();
		emfactory.close();
	}

}
