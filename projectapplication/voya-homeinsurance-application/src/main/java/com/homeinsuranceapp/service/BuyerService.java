package com.homeinsuranceapp.service;

import java.util.List;

import com.homeinsuranceapp.model.HomeInsurance;

public interface BuyerService {
	public List<HomeInsurance>getByName();
	public List<HomeInsurance>getById(int id);
	public List<HomeInsurance>getByAddress();

}
