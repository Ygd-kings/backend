package com.dealsand.coupons;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.dealsand.coupons.AdminRepository.AdminRepository;
import com.dealsand.coupons.controller.AdminController;
import com.dealsand.coupons.model.Admin;

@SpringBootTest
class AdminstrationApplicationTests {
	
	
	
	@MockBean
	AdminRepository adminrepository;
	@Autowired
	AdminController admincontroller;
	
	@Test
	public void getAllAdminTest() {
		
		when(adminrepository.findAll()).thenReturn(
				Stream.of (
				
				   new Admin("","kiran","kiran@gmail.com","1234"))
				.collect(Collectors.toList()));
		assertEquals(1,admincontroller.getAllAdmins().size());
						
    }
	
		
	@Test
	public void deleteAdminTest() {
		 String id= "11";
		 Admin add = new Admin("1","kiran","kiran@gmail.com","1234");
			adminrepository.deleteById(id);	 
			verify(adminrepository).deleteById(id);
	}
	
}

	
	
	
