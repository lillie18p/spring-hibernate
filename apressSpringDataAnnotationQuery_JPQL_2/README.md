## Spring Data JPA - Query generation from @Query Annotation JPQL

# Query Strategies
##### 1.- Query generation from Method Names
##### 2.- Query generation from @Query Annotation
##### 3.- Query generation from Named Querie

---------

##### 2.- Query generation from @Query Annotation can be 2 types
##### 2.1 Using Annotation JPQL
##### 2.2 Using Annotation SQL

---------

##### 2.1 Using Annotation JPQL
    Customer => nomeEntity
    
    name => nomeProperties(or field of entity)

	#JPQL
	@Query("SELECT t FROM Customer t WHERE t.name=?1)
	public List<Product> findByName_JPQL(String name);	

----------

+ Util Links

	https://dzone.com/efcardz/spring-annotations