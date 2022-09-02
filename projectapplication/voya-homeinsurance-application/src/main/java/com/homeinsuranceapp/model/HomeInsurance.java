package com.homeinsuranceapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
@Entity
public class HomeInsurance {
	@Id
	@GeneratedValue(generator = "insurance_gen",strategy =GenerationType.AUTO )
	@SequenceGenerator(name = "insurance_gen",sequenceName = "insurance_seq",initialValue = 999,allocationSize = 10)
	private Integer insuranceId;
	private String insuranceName;
	private String category;
	private double sumAssured;
	//content,building+content,building
	private String coverage;
	//fire,earthquake,theft
	private int term;
	private double premium ;
	@OneToOne
	private Vendor vendor;
	@ManyToOne
	private Buyer  buyers;
	public HomeInsurance() {
		super();
	}
	public HomeInsurance(String insuranceName, String category, double sumAssured, String coverage, int term,
			double premium, Vendor vendor, Buyer buyers) {
		super();
		this.insuranceName = insuranceName;
		this.category = category;
		this.sumAssured = sumAssured;
		this.coverage = coverage;
		this.term = term;
		this.premium = premium;
		this.vendor = vendor;
		this.buyers = buyers;
	}
	public Integer getInsuranceId() {
		return insuranceId;
	}
	public void setInsuranceId(Integer insuranceId) {
		this.insuranceId = insuranceId;
	}
	public String getInsuranceName() {
		return insuranceName;
	}
	public void setInsuranceName(String insuranceName) {
		this.insuranceName = insuranceName;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public double getSumAssured() {
		return sumAssured;
	}
	public void setSumAssured(double sumAssured) {
		this.sumAssured = sumAssured;
	}
	public String getCoverage() {
		return coverage;
	}
	public void setCoverage(String coverage) {
		this.coverage = coverage;
	}
	public int getTerm() {
		return term;
	}
	public void setTerm(int term) {
		this.term = term;
	}
	public double getPremium() {
		return premium;
	}
	public void setPremium(double premium) {
		this.premium = premium;
	}
	public Vendor getVendor() {
		return vendor;
	}
	public void setVendor(Vendor vendor) {
		this.vendor = vendor;
	}
	public Buyer getBuyers() {
		return buyers;
	}
	public void setBuyers(Buyer buyers) {
		this.buyers = buyers;
	}
	@Override
	public String toString() {
		return "HomeEquityInsurance [insuranceId=" + insuranceId + ", insuranceName=" + insuranceName + ", category="
				+ category + ", sumAssured=" + sumAssured + ", coverage=" + coverage + ", term=" + term + ", premium="
				+ premium + ", vendor=" + vendor + ", buyers=" + buyers + "]";
	}
	
	
	
}
