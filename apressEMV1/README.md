## ENTITY MANAGER - Version 1 
#### Use Entity Manager but leverage native Hibernate API

- It provide by hibernate
- Hibernate works with his session
- Get session

	 Session session = entityManager.unwrap(Session.class)
  	
- Do query

	 String query= "from A" 
    Query<A> aQuery = session.createQuery(query, A.class)

- List

	List<A> listA = aQuery.getResultList();
	
	
select - createQuery(query, A.class)

select customer by Id - get(A.class, id)

save customer - saveOrUpdate(refCustomer)

delete customer:

		public void deleteByDid(Integer idParam) {
			Session session = entityManager.unwrap(Session.class);
			String queryString= "delete from customer where id=:userId";
			Query query=session.createQuery(queryString);
			query.setParameter("userId", idParam);
			query.executeUpdate();
		}
		
+ We use
	
	- Controller
	- Service
	- DAO
	
---------
# Update

	{
		"id":1
		"name":"Viviana",
		"surname":"Brambilla",
		"email":"brambilla@gmail.com",
		"mobile":"07865645543",
		"purcharseDate":"12/4/19",
		"deliveryDate":"20/04/19"
	}
