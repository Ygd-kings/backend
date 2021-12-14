package com.dealsandcouponsApp.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.dealsandcouponsApp.model.Coupon;

public interface CouponsRepository extends MongoRepository<Coupon, String> {


	List<Coupon> findAllByProvider(String provider);

	

}