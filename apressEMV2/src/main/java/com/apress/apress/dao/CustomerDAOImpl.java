package com.apress.apress.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.apress.apress.entity.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO{
	
	EntityManager entityManager;

	@Autowired
	public CustomerDAOImpl(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	
	@Override
	public List<Customer> findAll() {
		//Get TypedQuery		
		String query = "from Customer";		
		TypedQuery<Customer> queryCustomer =entityManager.createQuery(query, Customer.class);
		List<Customer> listCustomeer = queryCustomer.getResultList();		
		return listCustomeer;
	}


	@Override
	public Customer findById(Integer id) {	
		Customer customer = entityManager.find(Customer.class, id);
		return customer;
	}


	@Override
	public void save(Customer customer) {		
		entityManager.merge(customer);
	}


	@Override	
	public void deleteByDid(Integer idParam) {		
		String queryString= "delete from Customer where id=:userId";
		Query query=(Query) entityManager.createQuery(queryString);
		query.setParameter("userId", idParam);
		query.executeUpdate();
	}

}
