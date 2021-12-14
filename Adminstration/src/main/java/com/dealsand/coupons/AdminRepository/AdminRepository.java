package com.dealsand.coupons.AdminRepository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.dealsand.coupons.model.Admin;

public interface AdminRepository extends MongoRepository<Admin, String> {

	}


