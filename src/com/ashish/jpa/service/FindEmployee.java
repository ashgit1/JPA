package com.ashish.jpa.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ashish.jpa.model.Employee;

public class FindEmployee {

	public static void main(String[] args) {

		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("Ashish_JPA");
		EntityManager entitymanager = emfactory.createEntityManager();

		// get the employee...
		Employee employee = entitymanager.find(Employee.class, 101);

		// display the employee...
		System.out.println("Name : " + employee.getEname());
		System.out.println("Id : " + employee.getEid());
		System.out.println("Salary : " + employee.getSalary());
		System.out.println("Degree : " + employee.getDeg());

	}
}
