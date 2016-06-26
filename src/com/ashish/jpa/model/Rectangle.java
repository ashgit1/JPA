package com.ashish.jpa.model;

import javax.persistence.Entity;

@Entity
public class Rectangle extends Shapes {

	private static final long serialVersionUID = 1L;

	private String sides;
	private String area;

	public Rectangle(int shid, String shname, String sides, String area) {
		super(shid, shname);
		this.sides = sides;
		this.area = area;
	}

	public Rectangle() {
		super();
	}

	public String getSides() {
		return sides;
	}

	public void setSides(String sides) {
		this.sides = sides;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

}