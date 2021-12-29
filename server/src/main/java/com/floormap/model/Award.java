package com.floormap.model;

public class Award {
	private String name;
	private String awardPicId;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAwardPicId() {
		return awardPicId;
	}
	public void setAwardPicId(String awardPicId) {
		this.awardPicId = awardPicId;
	}
	@Override
	public String toString() {
		return "Award [name=" + name + ", awardPicId=" + awardPicId + "]";
	}
	
	
}
