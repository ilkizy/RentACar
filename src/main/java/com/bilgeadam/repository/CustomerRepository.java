package com.bilgeadam.repository;

import com.bilgeadam.entity.Customer;
import com.bilgeadam.utility.MyRepository;

public class CustomerRepository extends MyRepository<Customer, Long> {

	public CustomerRepository() {
		super(new Customer());

	}

}
