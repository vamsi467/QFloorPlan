package com.floormap.model;

import java.util.List;

public class Salary {
	private float currentSalary;
	private List<Increment> increments;
	public float getCurrentSalary() {
		return currentSalary;
	}
	public void setCurrentSalary(float currentSalary) {
		this.currentSalary = currentSalary;
	}
	public List<Increment> getIncrements() {
		return increments;
	}
	public void setIncrements(List<Increment> increments) {
		this.increments = increments;
	}
	@Override
	public String toString() {
		return "Salary [currentSalary=" + currentSalary + ", increments=" + increments + "]";
	}
	
	
}
