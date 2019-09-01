package com.apress.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.dom4j.tree.AbstractEntity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Entity
@Table(name="Customer")
@Getter
@Setter
@RequiredArgsConstructor
@ToString
@NamedQuery(name="Customer.findBySurname_NameQuery",
query="FROM Customer t WHERE t.surname=?1")
public class Customer extends AbstractEntity{
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;
	
	@Column(name="first_name")
	private String name;
	
	@Column(name="last_name")
	private String surname;
	
	@Column(name="email")
	private String email;
	
	@Column(name="mobile")	
	private String mobile;
	
	@Column(name="purchase_date")	
	private String purchaseDate;
	
	@Column(name="delivery_date")	
	private String deliveryDate;

}
