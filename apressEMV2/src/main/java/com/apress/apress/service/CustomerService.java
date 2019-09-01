package com.apress.apress.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apress.apress.dao.CustomerDAO;
import com.apress.apress.entity.Customer;

@Service
public class CustomerService {

	CustomerDAO customerDAO;
	
	@Autowired
	public CustomerService(CustomerDAO customerDAO) {
		this.customerDAO = customerDAO;
	}
	
	@Transactional
	public List<Customer> getAllCustomer(){
		return customerDAO.findAll();
	}
	
	@Transactional
	public Customer getCustomer(Integer id) {
		return customerDAO.findById(id);
	}
	
	@Transactional
	public void saveCustomer(Customer customer) {
		customerDAO.save(customer);
	}
	
	@Transactional
	public void removeCustomer(Integer id) {
		customerDAO.deleteByDid(id);
	}
	
	@Transactional
	public void updateCustomer(Customer customer, int id) {
		 Customer custOlder =customerDAO.findById(id);
		 custOlder.setId(id);
		 custOlder.setName(customer.getName());
		 custOlder.setSurname(customer.getSurname());
		 custOlder.setEmail(customer.getEmail());
		 custOlder.setMobile(customer.getMobile());		 
		 custOlder.setPurchaseDate(customer.getPurchaseDate());
		 custOlder.setDeliveryDate(customer.getDeliveryDate());
		customerDAO.save(custOlder);
	}
}
