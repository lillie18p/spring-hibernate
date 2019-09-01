package com.apress.apress.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apress.apress.entity.Customer;
import com.apress.apress.service.CustomerService;

import lombok.Data;

@RestController
@RequestMapping("/customers")
public class CustomerController {
	
	CustomerService customerService;
	
	@Autowired
	public CustomerController(CustomerService customerService) {
		this.customerService = customerService;
	}

	@GetMapping("/all")
	public List<Customer> getAllClients(){
		return customerService.getAllCustomer();
	}
	
	@GetMapping("/{id}")
	public Customer getClient(@PathVariable int id) {
		return customerService.getCustomer(id);
		
	}
	
	@PostMapping("/customer")
	public void saveClient(@RequestBody Customer customer) {
		customerService.saveCustomer(customer);
	}
	
	@DeleteMapping("/{id}")
	public void removeClient(@PathVariable Integer id) {
		customerService.removeCustomer(id);
	}
	
	@PutMapping("/customer")//pass id in data
	public void updateClient(@RequestBody Customer customer) {
		customerService.updateCustomer(customer, customer.getId());
	}
	
}
