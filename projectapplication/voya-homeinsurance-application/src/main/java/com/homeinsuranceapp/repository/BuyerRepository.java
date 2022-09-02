package com.homeinsuranceapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.homeinsuranceapp.model.Buyer;
@Repository
public interface BuyerRepository extends  JpaRepository<Buyer, Integer>{

}
