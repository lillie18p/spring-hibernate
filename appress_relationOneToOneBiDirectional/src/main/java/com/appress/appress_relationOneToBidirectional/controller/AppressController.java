package com.appress.appress_relationOneToBidirectional.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.appress.appress_relationOneToBidirectional.entity.customer.Customer;
import com.appress.appress_relationOneToBidirectional.service.CustomerService;


@RestController
@RequestMapping("/customers")
public class AppressController {

	CustomerService customerService;
	
	public AppressController(CustomerService customerService) {
		this.customerService = customerService;
	}
	
	@GetMapping("/all")
	public List<Customer> shouldGetAllCustomerId() {
		return customerService.getAllCustomer();
	}
	@GetMapping("/client/{id}")
	public Customer shouldGetOneAddressByCustomerId(@PathVariable int id) {
		return customerService.getCustomerAndAddress(id);
	}
	
	@DeleteMapping("/address/{id}")
	public void shouldRemoveAddressOfCustomer(@PathVariable int id) {
		 customerService.removeAddressOfCustomer(id);
	}
	

}
