package com.floormap.model;

public class Lnd {
	
	private String name;
	private String status;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Lnd [name=" + name + ", status=" + status + "]";
	}

}
