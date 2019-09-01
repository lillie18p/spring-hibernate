# HIBERNATE - RELATIONE ONE TO ONE - BIDIRECTIONAL

## In a Bi-directional relationship

	We specify @OneToOne annotation on both the entities but only one entity
	is the owner of the relationship. Most often, the child entity is the 
	owner of the relationship and the parent entity is the inverse side of
	the relationship.
	
	The owner of the relationship contains a @JoinColumn annotation to specify
	the foreign key column, and the inverse-side of the relationship contains
	a mappedBy attribute to indicate that the relationship is mapped by the 
	other entity.


###### 1.- In class Customer map object Address - CascadeType.ALL

	@OneToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	@JoinColumn(name="address_id")
	private Address address;
	
	
###### 2.- In class Address map object Customer - CascadeType.ALL

	@OneToOne(mappedBy="address", cascade=CascadeType.ALL)	
	private Customer customer;
	
	
##### Utils links

https://www.callicoder.com/hibernate-spring-boot-jpa-one-to-one-mapping-example/


# Clean up database tables

     addressRepository.deleteAllInBatch();
     customerRepository.deleteAllInBatch();

Example:

keep customer and delete address

	Method: POST
	
	URL: http://localhost:8080/customers/address/13
	
	record 13 from address is deleting

	