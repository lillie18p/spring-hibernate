## SPRING DATA REST

- We need 

	+ Entity User
	+ DAO: UserRepository extend JpaRepository{}
	+ Main
	+ Maven: spring-boot-starter-data-rest

## Maven
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-data-rest</artifactId>
		</dependency>

- No need anymore: se elimina il controller and service

	+ Controller
	+ Service
		
		
###### 1.-URL	

+ URL is composed from domain + name entity in **lowercase** + s to the end of name domain

	Entity: Customer
	
	You got: customers
	
	URL: http://localhost:8080/customers

###### 2.- Modify URL

- In file properties added:

	spring.data.rest.base-path=/magic-api

- Then call:

	URL: http://localhost:8080/magic-api/customers


###### 3.- Further modification to URL by DAO

	@RepositoryRestResources(path="members")
	AIRepository extends JpaRepository<Customer, Integer> {}
	
http://localhost:8080/magic-api/customers

# Call data by browser

###### 1.- Get one user - pass ID in the URL

	http://localhost:8080/magic-api/customers/20
	
	{
	    
	    "name":"Emilio",
	    "surname": "Lari",
	    "email": "emilio.lari@luv2code.com",
	    "hired": "07/05/2019"
	}

###### 2.- Further step

+ Configuration

	@RepositoryRestResource(path="members")
	public interface CustomerRepository extends JpaRepository<Customer, Integer> {
	
	}
	URL: http://localhost:8080/magic-api/members

+ Pagination

	spring.data.rest.default-page=50
	
+ Sorting

	http://location:8080/employees?sort=lastname
	http://location:8080/employees?sort=firstname,desc
	http://location:8080/employees?sort=lastname, firstname,asc
	
		
###### 3.- Further stepUtils links		
		
	https://spring.io/understanding/HATEOAS
	
	JPL
	https://spring.io/projects/spring-data-rest		
		
	www.luv2code.com/spring-boot-props