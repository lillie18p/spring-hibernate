## ENTITY MANAGER - Version 2

+ Use JPA 
+ Hibernate works directly with **EntityManager** 

verion 2- Use EntityManager and Standar JPA API

	------------------------------------------------------------------------------------------
	Action                      |	Native HibernateMethod(V1)  |	JPA Method(V2)	
	------------------------------------------------------------------------------------------	
	retrieve list of entities   |	session.createQuery(...)    | 	entityManager.creteQuery(query, A.class)	
	------------------------------------------------------------------------------------------	
	retrieve entity by id       |	session.get(..)/load(..)    |	entityManager.find(...)	
	------------------------------------------------------------------------------------------	
	create/save                 |	session.save(...)           |	entityManager.persist(....)	
	------------------------------------------------------------------------------------------
	save/update entity          |	session.saveOrUpdate(..)    |	entityManager.merge(...)	
	------------------------------------------------------------------------------------------	
	delete entity               |	session.delete(...)         |	entityManager.remove(...)
	
+ We use
	
	- Controller
	- Service
	- DAO