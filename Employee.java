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
	
}
