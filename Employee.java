package com.emp;

import java.sql.Date;

public class Employee 
{
	private String EmployeeId;
	private String FirstName;
	private String LastName;
	private Date DOB;
	private String Gender;
	private String Qualification;
	private String Phone;
	private String Address;
	private String Designation;
	private Date DateOfJoining;
	private String Manager;
	private String WorkingOnProject;
	private Date ProjectFromDate;
	private Date ToDate;
	private String SkillSet;
	private String username;
	private String password;
	public String getEmployeeId() {
		return EmployeeId;
	}
	public void setEmployeeId(String employeeId) {
		EmployeeId = employeeId;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public Date getDOB() {
		return DOB;}
	public void setDOB(Date date) {
		DOB = date;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getQualification() {
		return Qualification;
	}
	public void setQualification(String qualification) {
		Qualification = qualification;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getDesignation() {
		return Designation;
	}
	public void setDesignation(String designation) {
		Designation = designation;
	}
	public Date getDateOfJoining() {
		return DateOfJoining;
	}
	public void setDateOfJoining(Date date) {
		DateOfJoining = date;
	}
	public String getManager() {
		return Manager;
	}
	public void setManager(String manager) {
		Manager = manager;
	}
	public String getWorkingOnProject() {
		return WorkingOnProject;
	}
	public void setWorkingOnProject(String workingOnProject) {
		WorkingOnProject = workingOnProject;
	}
	public Date getProjectFromDate() {
		return ProjectFromDate;
	}
	public void setProjectFromDate(Date date) {
		ProjectFromDate = date;
	}
	public Date getToDate() {
		return ToDate;
	}
	public void setToDate(Date toDate) {
		ToDate = toDate;
	}
	public String getSkillSet() {
		return SkillSet;
	}
	public void setSkillSet(String skillSet) {
		SkillSet = skillSet;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
