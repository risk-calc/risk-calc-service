package com.risk.calc.model;

import java.util.Date;
import java.util.Map;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonFormat;

@Document(collection="collection_of_risk_profiles")
public class RiskInfo {

	@Id
	private int id;
	private String name;
	private String address;
	
	private int yrsToRetirement;	
	private int noYrsInvestment;
	private String maritalStatus;
	private String occupation;
	
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd")
	private Date orderDate; 
	
	private Map<String, Integer> objectives;
	
	private Map<String, Long> finDetails;

	private Double riskAppetite;
	private Double riskTolerance;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getYrsToRetirement() {
		return yrsToRetirement;
	}

	public void setYrsToRetirement(int yrsToRetirement) {
		this.yrsToRetirement = yrsToRetirement;
	}

	public int getNoYrsInvestment() {
		return noYrsInvestment;
	}

	public void setNoYrsInvestment(int noYrsInvestment) {
		this.noYrsInvestment = noYrsInvestment;
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

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public Map<String, Integer> getObjectives() {
		return objectives;
	}

	public void setObjectives(Map<String, Integer> objectives) {
		this.objectives = objectives;
	}

	public Map<String, Long> getFinDetails() {
		return finDetails;
	}

	public void setFinDetails(Map<String, Long> finDetails) {
		this.finDetails = finDetails;
	}

	public Double getRiskAppetite() {
		return riskAppetite;
	}

	public void setRiskAppetite(Double riskAppetite) {
		this.riskAppetite = riskAppetite;
	}

	public Double getRiskTolerance() {
		return riskTolerance;
	}

	public void setRiskTolerance(Double riskTolerance) {
		this.riskTolerance = riskTolerance;
	}

	public RiskInfo(int id, String name, String address, int yrsToRetirement, int noYrsInvestment, String maritalStatus,
			String occupation, Date orderDate, Map<String, Integer> objectives, Map<String, Long> finDetails,
			Double riskAppetite, Double riskTolerance) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.yrsToRetirement = yrsToRetirement;
		this.noYrsInvestment = noYrsInvestment;
		this.maritalStatus = maritalStatus;
		this.occupation = occupation;
		this.orderDate = orderDate;
		this.objectives = objectives;
		this.finDetails = finDetails;
		this.riskAppetite = riskAppetite;
		this.riskTolerance = riskTolerance;
	}

	public RiskInfo() {
		super();
	}
	
}
