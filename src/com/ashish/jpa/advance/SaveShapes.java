package com.ashish.jpa.advance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ashish.jpa.model.Circle;
import com.ashish.jpa.model.Rectangle;

public class SaveShapes {

	public static void main(String[] args) {

		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("Ashish_JPA");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		//Rectangle Objects...
		Rectangle rect1 = new Rectangle(1, "Rectangle", "4", "Length * Breadth");
		
		//Circle Objects...
		Circle cir1  = new Circle(2, "Circle", "2 * pie * Radius");
		
		entitymanager.persist(rect1);
		entitymanager.persist(cir1);
		entitymanager.getTransaction().commit();
		
		//closing the connections...
		entitymanager.close();
		emfactory.close();
		
	}

}
