package com.deals.and.couponsApp.controller.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.deals.and.couponsApp.model.Companys;

public interface CompanyRepository extends MongoRepository<Companys, String> {


  void deleteByCompanyname(String companyname);

	Companys findByCompanyname(String companyname);



}