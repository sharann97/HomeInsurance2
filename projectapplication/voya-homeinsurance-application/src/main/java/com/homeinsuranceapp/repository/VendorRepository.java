package com.homeinsuranceapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.homeinsuranceapp.model.Vendor;
@Repository
public interface VendorRepository extends JpaRepository<Vendor, Integer> {
    public List<Vendor>find
}
