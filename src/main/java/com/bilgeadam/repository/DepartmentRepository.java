package com.bilgeadam.repository;

import com.bilgeadam.entity.Department;
import com.bilgeadam.utility.MyRepository;

public class DepartmentRepository extends MyRepository<Department, Long> {

	public DepartmentRepository() {
		super(new Department());
	}

}
