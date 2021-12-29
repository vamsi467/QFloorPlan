package com.floormap.model;

public class Designation {

	private String title;
	private String effectiveFrom;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getEffectiveFrom() {
		return effectiveFrom;
	}
	public void setEffectiveFrom(String effectiveFrom) {
		this.effectiveFrom = effectiveFrom;
	}
	@Override
	public String toString() {
		return "Designation [title=" + title + ", effectiveFrom=" + effectiveFrom + "]";
	}
	
	
	
}
