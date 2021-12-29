package com.floormap.model;

public class Increment {

	private float percentage;
	private String effectiveFrom;
	public float getPercentage() {
		return percentage;
	}
	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}
	public String getEffectiveFrom() {
		return effectiveFrom;
	}
	public void setEffectiveFrom(String effectiveFrom) {
		this.effectiveFrom = effectiveFrom;
	}
	@Override
	public String toString() {
		return "Increment [percentage=" + percentage + ", effectiveFrom=" + effectiveFrom + "]";
	}
	
	
}
