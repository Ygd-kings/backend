package com.deals.and.couponsApp.controller.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.deals.and.couponsApp.model.Coupon;

public interface CouponsRepository extends MongoRepository<Coupon, String> {

}