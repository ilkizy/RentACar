package com.bilgeadam.service;

import com.bilgeadam.entity.Rent;
import com.bilgeadam.repository.RentRepository;
import com.bilgeadam.utility.MyRepositoryService;

public class RentService extends MyRepositoryService<RentRepository, Rent, Long> {

	public RentService() {
		super(new RentRepository());
	}

}
