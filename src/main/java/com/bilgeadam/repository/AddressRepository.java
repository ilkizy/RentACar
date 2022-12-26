package com.bilgeadam.repository;

import com.bilgeadam.entity.Address;
import com.bilgeadam.utility.MyRepository;

public class AddressRepository extends MyRepository<Address, Long> {

	public AddressRepository() {
		super(new Address());
	}

}
