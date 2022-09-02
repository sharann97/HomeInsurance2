package com.homeinsuranceapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.homeinsuranceapp.model.Address;

@SpringBootApplication
public class VoyaHomeloanApplication {

	public static void main(String[] args) {
		SpringApplication.run(VoyaHomeloanApplication.class, args);
	}
   Address add = new Address(null, null, 0);
}
