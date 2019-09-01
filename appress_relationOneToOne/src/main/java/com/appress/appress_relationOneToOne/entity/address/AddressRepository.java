package com.appress.appress_relationOneToOne.entity.address;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.appress.appress_relationOneToOne.entity.address.Address;


@Repository
public interface AddressRepository extends JpaRepository<Address, Integer>{

}
