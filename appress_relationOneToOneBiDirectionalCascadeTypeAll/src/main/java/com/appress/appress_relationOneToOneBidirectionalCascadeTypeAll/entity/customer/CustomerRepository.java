package com.appress.appress_relationOneToOneBidirectionalCascadeTypeAll.entity.customer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
