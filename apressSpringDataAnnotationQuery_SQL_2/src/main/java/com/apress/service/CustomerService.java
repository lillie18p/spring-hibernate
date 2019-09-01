package com.apress.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apress.dao.CustomerRepository;
import com.apress.entity.Customer;

@Service
public class CustomerService {

	CustomerRepository customerRepository;
	
	@Autowired
	public CustomerService(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}
	
	public List<Customer> getCustomers(){
		return customerRepository.findAll();
	}
	
	public List<Customer> getCustomerBySurname(String surname){
		return customerRepository.findBySurname_SQL(surname);
	}

	public List<Customer> getCustomerBySurnameLike(String surname){
		return customerRepository.findBySurnameLike_SQL(surname);
	}


	public Customer findUserByNameAndSurnameNamedParams(String name, String surname){
		return customerRepository.findUserByNameAndSurnameNamedParams_SQL(name, surname);
	}

	public void saveCustomer(Customer customer){
//		customerRepository.insertCustomer(customer.getName(),customer.getSurname(), customer.getEmail(), customer.getMobile(), customer.getPurchaseDate(), customer.getDeliveryDate());
		customerRepository.save(customer);
	}
	
	public void updateCustomer(Customer customer) {
		Customer customerOld=customerRepository.findById(customer.getId()).get();
		customerOld.setName(customer.getName());
		customerOld.setSurname(customer.getSurname());
		customerOld.setEmail(customer.getEmail());
		customerOld.setMobile(customer.getMobile());
		customerOld.setPurchaseDate(customer.getPurchaseDate());
		customerOld.setDeliveryDate(customer.getDeliveryDate());
		customerRepository.save(customerOld);
	}
	
}
