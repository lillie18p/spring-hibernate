CREATE TABLE ADDRESS (
	id             int(11)     NOT NULL AUTO_INCREMENT,
	streetName     VARCHAR(45) DEFAULT NULL,
	zipCode       VARCHAR(12) DEFAULT NULL,
	city          VARCHAR(45) DEFAULT NULL,
	country         VARCHAR(45) DEFAULT NULL,	
	PRIMARY KEY(id)	
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

SET FOREIGN_KEY_CHECKS = 0;

CREATE TABLE CUSTOMER (
	id             int(11)     NOT NULL AUTO_INCREMENT,
	first_name     VARCHAR(45) DEFAULT NULL,
	last_name      VARCHAR(45) DEFAULT NULL,
	email          VARCHAR(45) DEFAULT NULL,
	mobile         VARCHAR(45) DEFAULT NULL,customer
	purcharse_date VARCHAR(45) DEFAULT NULL,
	delivery_date  VARCHAR(45) DEFAULT NULL,
	address_id     int(11)     DEFAULT NULL,
	PRIMARY KEY(id),
	KEY FK_ADDRESS_idx(address_id),
	CONSTRAINT FK_ADDRESS FOREIGN KEY(address_id)
	REFERENCES address(id) on DELETE NO ACTION ON UPDATE NO ACTION
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

SET FOREIGN_KEY_CHECKS=1
