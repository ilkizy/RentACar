package com.bilgeadam.service;

import com.bilgeadam.entity.Address;
import com.bilgeadam.repository.AddressRepository;
import com.bilgeadam.utility.MyRepositoryService;

public class AddressService extends MyRepositoryService<AddressRepository, Address, Long> {

	public AddressService() {
		super(new AddressRepository());
	}

}
