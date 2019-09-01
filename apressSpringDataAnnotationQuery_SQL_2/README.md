## Spring Data JPA - Query generation from @Query Annotation - SQL

+ DAO: interface
 
	EmployeRepository extends JpdaRepository<Employee, Integer>{}

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

##### 2.- Query generation from @Query Annotation can be 2 types
##### 2.1 Using Annotation JPQL
##### 2.2 Using Annotation SQL

---------

##### 2.2- Query generation from @Query Annotation

    Customer => nomeClass
    
    name => nomeProperties

	#SQL
	@Query(value= "SELECT t FROM Customer t WHERE t.name=?1", nativeQuery=true)
	public List<Product> findByName_SQL(String name);	
	
