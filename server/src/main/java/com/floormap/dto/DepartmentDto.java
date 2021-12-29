package com.floormap.dto;

public class DepartmentDto {
	
	private int departmentId;
	private String startDate;
	private String endDate;
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	@Override
	public String toString() {
		return "DepartmentDto [departmentId=" + departmentId + ", startDate=" + startDate + ", endDate=" + endDate
				+ "]";
	}

}
