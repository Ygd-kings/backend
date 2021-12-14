package com.dealsand.coupons.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.dealsand.coupons.model.Customer;

public interface CustomerRepository extends MongoRepository<Customer, String> {
	
	Customer findByid(String id);

}