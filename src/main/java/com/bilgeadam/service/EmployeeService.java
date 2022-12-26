package com.bilgeadam.service;

import com.bilgeadam.entity.Employee;
import com.bilgeadam.repository.EmployeeRepository;
import com.bilgeadam.utility.MyRepositoryService;

public class EmployeeService extends MyRepositoryService<EmployeeRepository, Employee, Long> {

	public EmployeeService() {
		super(new EmployeeRepository());
	}

}
