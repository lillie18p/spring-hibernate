package com.appress.appress_relationOneToOneJacksonBidirectional.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.appress.appress_relationOneToOneJacksonBidirectional.entity.customer.Customer;
import com.appress.appress_relationOneToOneJacksonBidirectional.service.CustomerService;


@RestController
@RequestMapping("/customers")
public class AppressController {

	CustomerService customerService;
	
	public AppressController(CustomerService customerService) {
		this.customerService = customerService;
	}
	
	@GetMapping("/all")
	public List<Customer> shouldGetAllCustomer() {
		return customerService.getCustomers();
	}
	
	@GetMapping("/client/{id}")
	public Customer shouldGetOneAddressByCustomerId(@PathVariable int id) {
		return customerService.getCustomerAndAddress(id);
	}
	
	@PostMapping("/customer")
	public void  shouldSaveClient(@RequestBody Customer customer) {
		 customerService.shouldSaveCustomer(customer);
	}
	
	
	@PutMapping("/customer")
	public void  shouldModifyClient(@RequestBody Customer customer) {
		 customerService.shouldModifyCustomer(customer);
	}
	
	@DeleteMapping("/{id}")
	public void shouldDeleteCustomerAndAddress(@PathVariable int id) {
		 customerService.removeCustomerAndAddress(id);
	}
	

	
	
}
