package com.bilgeadam.repository;

import com.bilgeadam.entity.Employee;
import com.bilgeadam.utility.MyRepository;

public class EmployeeRepository extends MyRepository<Employee, Long> {

	public EmployeeRepository() {
		super(new Employee());

	}

}
