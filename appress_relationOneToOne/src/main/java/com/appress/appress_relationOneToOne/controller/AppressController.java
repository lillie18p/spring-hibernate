package com.appress.appress_relationOneToOne.controller;

import com.appress.appress_relationOneToOne.service.CustomerService;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.appress.appress_relationOneToOne.entity.customer.Customer;

@RestController
public class AppressController {

	CustomerService customerService;
	
	public AppressController(CustomerService customerService) {
		this.customerService = customerService;
	}
	
	@GetMapping("/all")
	public List<Customer> shouldGetAllCustomer(){
		return customerService.selectAllCustomer();
	}
	
	@PostMapping("/customer")
	public void shouldCreateCustomer(@RequestBody Customer customer){
		 customerService.insertCustomer(customer);
	}
}
