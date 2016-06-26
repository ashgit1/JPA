package com.ashish.jpa.model;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(referencedColumnName = "pid")
public class TennisPlayers extends Players {

	private static final long serialVersionUID = 1L;

	private String country;
	private int noOfSlams;

	public TennisPlayers(int pid, String pname, String country, int noOfSlams) {
		super(pid, pname);
		this.country = country;
		this.noOfSlams = noOfSlams;
	}

	public TennisPlayers() {
		super();
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getNoOfSlams() {
		return noOfSlams;
	}

	public void setNoOfSlams(int noOfSlams) {
		this.noOfSlams = noOfSlams;
	}
}
