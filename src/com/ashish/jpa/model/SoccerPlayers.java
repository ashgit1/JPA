package com.ashish.jpa.model;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(referencedColumnName = "pid")
public class SoccerPlayers extends Players {

	private static final long serialVersionUID = 1L;

	private String clubName;
	private int noOfBallondars;

	public SoccerPlayers(int pid, String pname, String clubName, int noOfBallodars) {
		super(pid, pname);
		this.clubName = clubName;
		this.noOfBallondars = noOfBallodars;
	}

	public SoccerPlayers() {
		super();
	}

	public String getClubName() {
		return clubName;
	}

	public void setClubName(String clubName) {
		this.clubName = clubName;
	}

	public int getNoOfBallondars() {
		return noOfBallondars;
	}

	public void setNoOfBallondars(int noOfBallondars) {
		this.noOfBallondars = noOfBallondars;
	}

}
