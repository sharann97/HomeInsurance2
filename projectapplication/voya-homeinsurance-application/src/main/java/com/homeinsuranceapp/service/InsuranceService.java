package com.homeinsuranceapp.service;

import java.util.List;

import com.homeinsuranceapp.model.HomeInsurance;

public interface InsuranceService {
	
	public void addInsurance(HomeInsurance homeinsurance);
	public void updateInsurance(HomeInsurance homeinsurance);
	public void deleteInsurance(int insuranceId);

    public List<HomeInsurance>getAll();
    public List<HomeInsurance>getByName(String name);
    public List<HomeInsurance>getById(int insuranceId);
    public List<HomeInsurance>getByCategory(String category);
    public List<HomeInsurance>getBySumAssured(double sumAssured);
    public List<HomeInsurance>getByCoverage(String coverage);
    public List<HomeInsurance>getByTerm(int term);
    public List<HomeInsurance>getByPremium(double premium);
    public List<HomeInsurance>getByVendor(String vendor);
    public double calculateCost(double homeCost,double squareFt);
    

}
