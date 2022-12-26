package com.bilgeadam.service;

import com.bilgeadam.entity.Customer;
import com.bilgeadam.repository.CustomerRepository;
import com.bilgeadam.utility.MyRepositoryService;

public class CustomerService extends MyRepositoryService<CustomerRepository, Customer, Long> {

	public CustomerService() {
		super(new CustomerRepository());

	}

}
