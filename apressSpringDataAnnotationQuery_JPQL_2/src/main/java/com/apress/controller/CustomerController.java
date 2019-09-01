package com.apress.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apress.entity.Customer;
import com.apress.service.CustomerService;

@RestController
@RequestMapping("/customers")
public class CustomerController {
	
	CustomerService customerService;
	
	@Autowired
	public CustomerController(CustomerService customerService) {
		this.customerService = customerService;
	}

  
	@GetMapping("/{surname}")
	public List<Customer> getAllClients(@PathVariable String surname){
		return customerService.getCustomerBySurname(surname);
	}

	@GetMapping("/customerLike/{surname}")
	public List<Customer> getClientsLike(@PathVariable String surname){
		return customerService.getCustomerBySurnameLike(surname);
	}

	@GetMapping("/{name}/{surname}")
	public Customer getClientsLike(@PathVariable String name, @PathVariable String surname){
		return customerService.findUserByNameAndSurnameNamedParams(name, surname);
	}

}
