package com.ashish.jpa.service;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import com.ashish.jpa.model.Employee;

public class BetweenAndLikeFunctions {

	public static void main(String[] args) {

		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("Ashish_JPA");
		EntityManager entitymanager = emfactory.createEntityManager();

		// Between
		Query query = entitymanager.createQuery("Select e "
				+ "from Employee e " + "where e.salary "
				+ "Between 2500 and 3500");

		@SuppressWarnings("unchecked")
		List<Employee> list = (List<Employee>) query.getResultList();

		System.out.println("Salary between 2500-3500 :");
		for (Employee e : list) {
			System.out.print("Employee ID :" + e.getEid());
			System.out.println("\t Employee salary :" + e.getSalary());
		}

		// Like
		Query query1 = entitymanager.createQuery("Select e "
				+ "from Employee e " + "where e.ename LIKE 'A%'");

		@SuppressWarnings("unchecked")
		List<Employee> list1 = (List<Employee>) query1.getResultList();

		System.out.println("Employees Name starting with A :");
		for (Employee e : list1) {
			System.out.print("Employee ID :" + e.getEid());
			System.out.println("\t Employee name :" + e.getEname());
		}
	}
}
