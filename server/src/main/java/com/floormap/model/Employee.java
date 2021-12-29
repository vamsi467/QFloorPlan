package com.floormap.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.floormap.dto.DepartmentDto;

@Document(collection = "Employee")
public class Employee {
	
	@Id
	private long id;
	private String deskNo;
	private String lockerNo;
	private List<Asset> assets;
	private String accessCardNo;
	private String emailId;
	private String profilePicId;
	private List<Designation> designations;
	private List<DepartmentDto> departments;
	private List<Skill> skills;
	private Shift shift;
	private Salary salary;
	private List<String> awards;
	private float experience;
	private List<Lnd> lnd;
	private List<String> responsibilities;
	private List<Employee> empobj;
	private List<Department> deptobj;
	public List<Department> getDeptobj() {
		return deptobj;
	}
	public void setDeptobj(List<Department> deptobj) {
		this.deptobj = deptobj;
	}
	public List<Employee> getEmpobj() {
		return empobj;
	}
	public void setEmpobj(List<Employee> empobj) {
		this.empobj = empobj;
	}
	private Boolean bandwidth;
	public static String EMPLOYEE_SEQUENCE = "employee_sequence";
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDeskNo() {
		return deskNo;
	}
	public void setDeskNo(String deskNo) {
		this.deskNo = deskNo;
	}
	public String getLockerNo() {
		return lockerNo;
	}
	public void setLockerNo(String lockerNo) {
		this.lockerNo = lockerNo;
	}
	public List<Asset> getAssets() {
		return assets;
	}
	public void setAssets(List<Asset> assets) {
		this.assets = assets;
	}
	public String getAccessCardNo() {
		return accessCardNo;
	}
	public void setAccessCardNo(String accessCardNo) {
		this.accessCardNo = accessCardNo;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getProfilePicId() {
		return profilePicId;
	}
	public void setProfilePicId(String profilePicId) {
		this.profilePicId = profilePicId;
	}
	public List<Designation> getDesignations() {
		return designations;
	}
	public void setDesignations(List<Designation> designations) {
		this.designations = designations;
	}
	public List<DepartmentDto> getDepartments() {
		return departments;
	}
	public void setDepartments(List<DepartmentDto> departments) {
		this.departments = departments;
	}
	public List<Skill> getSkills() {
		return skills;
	}
	public void setSkills(List<Skill> skills) {
		this.skills = skills;
	}
	public Shift getShift() {
		return shift;
	}
	public void setShift(Shift shift) {
		this.shift = shift;
	}
	public Salary getSalary() {
		return salary;
	}
	public void setSalary(Salary salary) {
		this.salary = salary;
	}
	public List<String> getAwards() {
		return awards;
	}
	public void setAwards(List<String> awards) {
		this.awards = awards;
	}
	public float getExperience() {
		return experience;
	}
	public void setExperience(float experience) {
		this.experience = experience;
	}
	
	public List<Lnd> getLnd() {
		return lnd;
	}
	public void setLnd(List<Lnd> lnd) {
		this.lnd = lnd;
	}
	public List<String> getResponsibilities() {
		return responsibilities;
	}
	public void setResponsibilities(List<String> responsibilities) {
		this.responsibilities = responsibilities;
	}
	public Boolean getBandwidth() {
		return bandwidth;
	}
	public void setBandwidth(Boolean bandwidth) {
		this.bandwidth = bandwidth;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", deskNo=" + deskNo + ", lockerNo=" + lockerNo + ", assets=" + assets
				+ ", accessCardNo=" + accessCardNo + ", emailId=" + emailId + ", profilePicId=" + profilePicId
				+ ", designations=" + designations + ", departments=" + departments + ", skills=" + skills + ", shift="
				+ shift + ", salary=" + salary + ", awards=" + awards + ", experience=" + experience + ", lnd=" + lnd
				+ ", responsibilities=" + responsibilities + ", bandwidth=" + bandwidth + "]";
	}
	
	
}
