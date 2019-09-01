package com.apress.controller;

import java.util.List;

import com.apress.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apress.entity.Customer;

@RestController
@RequestMapping("/customers")
public class CustomerController {
	
	CustomerService customerService;
	
	@Autowired
	public CustomerController(CustomerService customerService) {
		this.customerService = customerService;
	}

//	@GetMapping("/all")
//	public List<Customer> getAllClients(){
//		return customerService.getAllCustomer();
//	}
	@GetMapping("/{surname}")
	public List<Customer> getAllClients(@PathVariable String surname){
		return customerService.getAllCustomer(surname);
	}
	
	
}
