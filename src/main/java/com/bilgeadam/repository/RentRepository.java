package com.bilgeadam.repository;

import com.bilgeadam.entity.Rent;
import com.bilgeadam.utility.MyRepository;

public class RentRepository extends MyRepository<Rent, Long> {

	public RentRepository() {
		super(new Rent());

	}

}
