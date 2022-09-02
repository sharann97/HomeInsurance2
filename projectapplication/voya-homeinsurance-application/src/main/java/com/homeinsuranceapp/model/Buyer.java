package com.homeinsuranceapp.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
@Entity
public class Buyer {
	@Id
	@GeneratedValue(generator = "buyer_gen",strategy =GenerationType.AUTO)
	@SequenceGenerator(name = "buyer_gen",sequenceName = "buyer_seq",initialValue =500,allocationSize = 1)
	private Integer buyerId;
	private String name;
	private long mobileNo;
	@OneToOne
	private Address address;
	private String type;
	private String occupation;
	@OneToMany
	private Set<HomeInsurance> insurances;
	public Buyer() {
		super();
	}
	public Buyer(String name, long mobileNo, Address address, String type, String occupation) {
		super();
		this.name = name;
		this.mobileNo = mobileNo;
		this.address = address;
		this.type = type;
		this.occupation = occupation;
	}
	public Integer getBuyerId() {
		return buyerId;
	}
	public void setBuyerId(Integer buyerId) {
		this.buyerId = buyerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public Set<HomeInsurance> getInsurances() {
		return insurances;
	}
	public void setInsurances(Set<HomeInsurance> insurances) {
		this.insurances = insurances;
	}
	
}
