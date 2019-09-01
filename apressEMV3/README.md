## ENTITY MANAGER - Version 3 

# Spring Data JPA

+ DAO: interface
 
	EmployeRepository extends JpdaRepository<Employee, Integer>{}

+ JPA_Repository

	- Spring Data JPA provides the interfaces JpaRepository.
	- Exposes methods (some by inheritance from parents)
	
		findAll()
		
		findById()/deleteById()
		
		save()
		
		findByLastName()

+ We use
	
	- Controller
	- Service
	- DAO

+ Maven
	
	<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-data-jpa</artifactId>
	</dependency>

+ Util Links

	www.luv2code.com/jpa-repository-javadoc