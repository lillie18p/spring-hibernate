package com.apress.apress.dao;

import java.util.List;

import javax.persistence.EntityManager;
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
		//Get session
		Session session = entityManager.unwrap(Session.class);
		String query = "from Customer";
		//Make query
		Query<Customer> queryCustomer =session.createQuery(query, Customer.class);
		
		//list
		List<Customer> listCustomeer = queryCustomer.getResultList();
		
		return listCustomeer;
	}


	@Override
	public Customer findById(Integer id) {
		Session session = entityManager.unwrap(Session.class);
		Customer customer = session.get(Customer.class, id);
		return customer;
	}


	@Override
	public void save(Customer customer) {
		Session session = entityManager.unwrap(Session.class);
		session.save(customer);
	}


	@Override	
	public void deleteById(Integer idParam) {
		Session session = entityManager.unwrap(Session.class);
		String queryString= "delete from Customer where id=:userId";
		Query query=session.createQuery(queryString);
		query.setParameter("userId", idParam);
		query.executeUpdate();
	}

}
