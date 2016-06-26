package com.ashish.jpa.advance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ashish.jpa.model.SoccerPlayers;
import com.ashish.jpa.model.TennisPlayers;

public class SavePlayers {

	public static void main(String[] args) {
		
		EntityManagerFactory emfactory =  Persistence.createEntityManagerFactory("Ashish_JPA");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		// Soccer Players...
		SoccerPlayers scpl1 = new SoccerPlayers(101, "Lionel Messi", "Barcelona", 5);
		SoccerPlayers scpl2 = new SoccerPlayers(102, "Cristiano Ronaldo", "RealMadrid", 3);
		
		// Tennis Players...
		TennisPlayers tnpl1 = new TennisPlayers(103, "Roger Federer", "Switerzland", 17);
		TennisPlayers tnpl2 = new TennisPlayers(104, "Rafael Nadal", "Spain", 14);
		TennisPlayers tnpl3 = new TennisPlayers(105, "Novak Djokovic", "Serbia", 12);
		
		entitymanager.persist(scpl1);
		entitymanager.persist(scpl2);
		entitymanager.persist(tnpl1);
		entitymanager.persist(tnpl2);
		entitymanager.persist(tnpl3);
		
		entitymanager.getTransaction().commit();
		
		//closing the entity manager factory and entity manager...
		entitymanager.close();
		emfactory.close();
		
	}

}
