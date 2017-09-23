/**
 * 
 */
package com.risk.calc.model;

/**
 * @author sandy
 * Entity to store investment objectives
 */
public class InvestmentObjectives {

	private int id;
	private double buildUpSavings;
	private String prepareForEstateTransfer;
	private String makeNonFinancialInvestment;
	private String receiveRegularIncome;
	private String seizeMarketOpportunities;
	private String other;
	private int personalId;
	
	/**
	 * 
	 */
	public InvestmentObjectives() {

	}

	/**
	 * @param id
	 * @param buildUpSavings
	 * @param prepareForEstateTransfer
	 * @param makeNonFinancialInvestment
	 * @param receiveRegularIncome
	 * @param seizeMarketOpportunities
	 * @param other
	 * @param personalId
	 */
	public InvestmentObjectives(int id, double buildUpSavings,
			String prepareForEstateTransfer, String makeNonFinancialInvestment,
			String receiveRegularIncome, String seizeMarketOpportunities,
			String other, int personalId) {
		this.id = id;
		this.buildUpSavings = buildUpSavings;
		this.prepareForEstateTransfer = prepareForEstateTransfer;
		this.makeNonFinancialInvestment = makeNonFinancialInvestment;
		this.receiveRegularIncome = receiveRegularIncome;
		this.seizeMarketOpportunities = seizeMarketOpportunities;
		this.other = other;
		this.personalId = personalId;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the buildUpSavings
	 */
	public double getBuildUpSavings() {
		return buildUpSavings;
	}

	/**
	 * @param buildUpSavings the buildUpSavings to set
	 */
	public void setBuildUpSavings(double buildUpSavings) {
		this.buildUpSavings = buildUpSavings;
	}

	/**
	 * @return the prepareForEstateTransfer
	 */
	public String getPrepareForEstateTransfer() {
		return prepareForEstateTransfer;
	}

	/**
	 * @param prepareForEstateTransfer the prepareForEstateTransfer to set
	 */
	public void setPrepareForEstateTransfer(String prepareForEstateTransfer) {
		this.prepareForEstateTransfer = prepareForEstateTransfer;
	}

	/**
	 * @return the makeNonFinancialInvestment
	 */
	public String getMakeNonFinancialInvestment() {
		return makeNonFinancialInvestment;
	}

	/**
	 * @param makeNonFinancialInvestment the makeNonFinancialInvestment to set
	 */
	public void setMakeNonFinancialInvestment(String makeNonFinancialInvestment) {
		this.makeNonFinancialInvestment = makeNonFinancialInvestment;
	}

	/**
	 * @return the receiveRegularIncome
	 */
	public String getReceiveRegularIncome() {
		return receiveRegularIncome;
	}

	/**
	 * @param receiveRegularIncome the receiveRegularIncome to set
	 */
	public void setReceiveRegularIncome(String receiveRegularIncome) {
		this.receiveRegularIncome = receiveRegularIncome;
	}

	/**
	 * @return the seizeMarketOpportunities
	 */
	public String getSeizeMarketOpportunities() {
		return seizeMarketOpportunities;
	}

	/**
	 * @param seizeMarketOpportunities the seizeMarketOpportunities to set
	 */
	public void setSeizeMarketOpportunities(String seizeMarketOpportunities) {
		this.seizeMarketOpportunities = seizeMarketOpportunities;
	}

	/**
	 * @return the other
	 */
	public String getOther() {
		return other;
	}

	/**
	 * @param other the other to set
	 */
	public void setOther(String other) {
		this.other = other;
	}

	/**
	 * @return the personalId
	 */
	public int getPersonalId() {
		return personalId;
	}

	/**
	 * @param personalId the personalId to set
	 */
	public void setPersonalId(int personalId) {
		this.personalId = personalId;
	}
	
}
