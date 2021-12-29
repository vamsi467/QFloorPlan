package com.floormap.model;

public class Skill {
	private String name;
	private Boolean certification;
	private Boolean likeToWork;
	private Boolean teach;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Boolean getCertification() {
		return certification;
	}
	public void setCertification(Boolean certification) {
		this.certification = certification;
	}
	
	public Boolean getTeach() {
		return teach;
	}
	public void setTeach(Boolean teach) {
		this.teach = teach;
	}
	public Boolean getLikeToWork() {
		return likeToWork;
	}
	public void setLikeToWork(Boolean likeToWork) {
		this.likeToWork = likeToWork;
	}
	@Override
	public String toString() {
		return "Skill [name=" + name + ", certification=" + certification + ", likeToWork=" + likeToWork + ", teach="
				+ teach + "]";
	}
	
}
