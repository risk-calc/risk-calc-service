package com.risk.calc.model;

/**
 * 
 * @author sandy
 * Entity to store financial details of the customer
 */
public class FinancialDetails {

	private int id;
	private double annualIncome;
	private double cash;
	private double lifeInsurance;
	private double otherFinancialAssets;
	private double realEstateAsset;
	private double recurringFinance;
    private int personalId;

    /**
	 * 
	 */
	public FinancialDetails() {
	
	}
	/**
	 * @param id
	 * @param annualIncome
	 * @param cash
	 * @param lifeInsurance
	 * @param otherFinancialAssets
	 * @param realEstateAsset
	 * @param recurringFinance
	 * @param personalId
	 */
	public FinancialDetails(int id, double annualIncome, double cash,
			double lifeInsurance, double otherFinancialAssets,
			double realEstateAsset, double recurringFinance, int personalId) {
		this.id = id;
		this.annualIncome = annualIncome;
		this.cash = cash;
		this.lifeInsurance = lifeInsurance;
		this.otherFinancialAssets = otherFinancialAssets;
		this.realEstateAsset = realEstateAsset;
		this.recurringFinance = recurringFinance;
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
	 * @return the annualIncome
	 */
	public double getAnnualIncome() {
		return annualIncome;
	}
	/**
	 * @param annualIncome the annualIncome to set
	 */
	public void setAnnualIncome(double annualIncome) {
		this.annualIncome = annualIncome;
	}
	/**
	 * @return the cash
	 */
	public double getCash() {
		return cash;
	}
	/**
	 * @param cash the cash to set
	 */
	public void setCash(double cash) {
		this.cash = cash;
	}
	/**
	 * @return the lifeInsurance
	 */
	public double getLifeInsurance() {
		return lifeInsurance;
	}
	/**
	 * @param lifeInsurance the lifeInsurance to set
	 */
	public void setLifeInsurance(double lifeInsurance) {
		this.lifeInsurance = lifeInsurance;
	}
	/**
	 * @return the otherFinancialAssets
	 */
	public double getOtherFinancialAssets() {
		return otherFinancialAssets;
	}
	/**
	 * @param otherFinancialAssets the otherFinancialAssets to set
	 */
	public void setOtherFinancialAssets(double otherFinancialAssets) {
		this.otherFinancialAssets = otherFinancialAssets;
	}
	/**
	 * @return the realEstateAsset
	 */
	public double getRealEstateAsset() {
		return realEstateAsset;
	}
	/**
	 * @param realEstateAsset the realEstateAsset to set
	 */
	public void setRealEstateAsset(double realEstateAsset) {
		this.realEstateAsset = realEstateAsset;
	}
	/**
	 * @return the recurringFinance
	 */
	public double getRecurringFinance() {
		return recurringFinance;
	}
	/**
	 * @param recurringFinance the recurringFinance to set
	 */
	public void setRecurringFinance(double recurringFinance) {
		this.recurringFinance = recurringFinance;
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
