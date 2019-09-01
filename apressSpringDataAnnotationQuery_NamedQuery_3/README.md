## Spring Data JPA - NAMED QUERIES

+ DAO: interface
 
	EmployeRepository extends JpdaRepository<Customer, Integer>{}

+ JPA_Repository

	- Spring Data JPA provides the interfaces JpaRepository
	- Exposes methods (some by inheritance from parents)
	
		findAll()	
		
		save()

# Query Strategies
##### 1.- Query generation from Method Names
##### 2.- Query generation from @Query Annotation
##### 3.- Query generation from Named Queries


---------

##### 3.- Query generation from Named queries (+ Entity class)

a.- Entity class

	 @Entity
	 @NamedQuery(name="Customer.findByName_NameQuery",
	             query="FROM Customer t WHERE t.name=?1")
	 public class Customer{   }

b.- Repository Interface

	public interface CustomerRepository extends JpaRepository<Customer, Integer>
	
	List<Customer>  findByName_NamedQuery(String name);
	}

c.- Service

	customer = customerRepository.findByName_NamedQuery("pippo");

+ Utils Links

	https://dzone.com/efcardz/spring-annotations
	
