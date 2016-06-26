package com.ashish.jpa.model;

import javax.persistence.Entity;

@Entity
public class Circle extends Shapes {

	private static final long serialVersionUID = 1L;

	private String circumference;

	public Circle(int shid, String shname, String circumference) {
		super(shid, shname);
		this.circumference = circumference;
	}

	public Circle() {
		super();
	}

	public String getCircumference() {
		return circumference;
	}

	public void setCircumference(String circumference) {
		this.circumference = circumference;
	}
}
