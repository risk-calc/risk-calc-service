package com.risk.calc.model;

import java.sql.Date;
/**
 * 
 * @author sandy
 * Entity class to store personal data of the customer
 */

public class PersonalData {

	private int id;
	private String firstName;
	private String name;
	private Date dob;
	private String address;
	private String maritalStatus;
	private String occupation;
	private double yearsOfRetirement;
	
	public PersonalData(){
		
	}

	/**
	 * @param id
	 * @param firstName
	 * @param name
	 * @param dob
	 * @param address
	 * @param maritalStatus
	 * @param occupation
	 * @param yearsOfRetirement
	 */
	public PersonalData(int id, String firstName, String name, Date dob,
			String address, String maritalStatus, String occupation,
			double yearsOfRetirement) {
		this.id = id;
		this.firstName = firstName;
		this.name = name;
		this.dob = dob;
		this.address = address;
		this.maritalStatus = maritalStatus;
		this.occupation = occupation;
		this.yearsOfRetirement = yearsOfRetirement;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public double getYearsOfRetirement() {
		return yearsOfRetirement;
	}

	public void setYearsOfRetirement(double yearsOfRetirement) {
		this.yearsOfRetirement = yearsOfRetirement;
	}
	
}
