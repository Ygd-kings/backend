package com.dealsandcouponsApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;



@SpringBootApplication
public class CouponsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CouponsApplication.class, args);
	}
	
	/*
	 * @Bean public Docket swaggerConfiguration() {
	 * 
	 * return new Docket(DocumentationType.SWAGGER_2) .select()
	 * .paths(PathSelectors.ant("/api/*"))
	 * .apis(RequestHandlerSelectors.basePackage("com.dealsandcouponsApp.controller"
	 * )) .build(); }
	 */
}
