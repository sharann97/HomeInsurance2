package com.homeinsuranceapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.homeinsuranceapp.model.HomeInsurance;
@Repository
public interface InsuranceRepository extends JpaRepository<HomeInsurance, Integer> {
    public List<HomeInsurance>findByVendorName(String name);
    public List<HomeInsurance>findByCoverage
}
