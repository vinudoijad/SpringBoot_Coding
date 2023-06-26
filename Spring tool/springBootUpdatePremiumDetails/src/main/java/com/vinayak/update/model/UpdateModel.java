package com.vinayak.update.model;

//Task 154 Design API to update premium details into database-----------> Vinayak

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "premiumDetails")
public class UpdateModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String premiumId;
	private String policyId;
	private String policyHolderName;
	private float InstallmentPremiumAmount;
	private String Policycommencementdate;
	private String Policyscheduletable;
	private String PolicyName;
	private String planName;
	private String userName;
	private float premiumAmount;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPremiumId() {
		return premiumId;
	}

	public void setPremiumId(String premiumId) {
		this.premiumId = premiumId;
	}

	public String getPolicyId() {
		return policyId;
	}

	public void setPolicyId(String policyId) {
		this.policyId = policyId;
	}

	public String getPolicyHolderName() {
		return policyHolderName;
	}

	public void setPolicyHolderName(String policyHolderName) {
		this.policyHolderName = policyHolderName;
	}

	public float getInstallmentPremiumAmount() {
		return InstallmentPremiumAmount;
	}

	public void setInstallmentPremiumAmount(float installmentPremiumAmount) {
		InstallmentPremiumAmount = installmentPremiumAmount;
	}

	public String getPolicycommencementdate() {
		return Policycommencementdate;
	}

	public void setPolicycommencementdate(String policycommencementdate) {
		Policycommencementdate = policycommencementdate;
	}

	public String getPolicyscheduletable() {
		return Policyscheduletable;
	}

	public void setPolicyscheduletable(String policyscheduletable) {
		Policyscheduletable = policyscheduletable;
	}

	public String getPolicyName() {
		return PolicyName;
	}

	public void setPolicyName(String policyName) {
		PolicyName = policyName;
	}

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public float getPremiumAmount() {
		return premiumAmount;
	}

	public void setPremiumAmount(float premiumAmount) {
		this.premiumAmount = premiumAmount;
	}

}
