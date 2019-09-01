# HIBERNATE - RELATIONE ONE TO ONE - UNIDIRECTIONAL


###### 1.- Map object Address

	@OneToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	@JoinColumn(name="address_id")
	private Address address;

---------

##### Relation

	OneToOne   EAGER
	OneToMany  LAZY
	ManyToOne  EAGER
	ManyToMany LAZY
	
---------

###### 1.- EAGER
Carica entita A and B

###### 1.- LAZY
Carica entita A and B on demand (but the connection should be open)

--------

###### CASCADE

	Delete                    A                          B
	--------------------------------------------------------------------------------------
	Entita A and B          CascadeType.ALL   	CascadeType.ALL
	--------------------------------------------------------------------------------------
	Entita B and keep A     CascadeType.ALL     cascade={CascadeType.DETACH,
	                                                     CascadeType.PERSIST,
	                                                     CascadeType.MERGE,
	                                                     CascadeType.REFRESH}
	--------------------------------------------------------------------------------------
	Entita A but not B      cascade={CascadeType.DETACH, 		cascade={CascadeType.DETACH,
	or Delete entita B               CascadeType.PERSIST,            	CascadeType.PERSIST,
	and NO entita A                  CascadeType.MERGE,             	CascadeType.MERGE,
	                                 CascadeType.REFRESH}           	CascadeType.REFRESH}