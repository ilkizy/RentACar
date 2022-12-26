package com.bilgeadam.service;

import com.bilgeadam.entity.Department;
import com.bilgeadam.repository.DepartmentRepository;
import com.bilgeadam.utility.MyRepositoryService;

public class DepartmentService extends MyRepositoryService<DepartmentRepository, Department, Long> {

	public DepartmentService() {
		super(new DepartmentRepository());
	}

}
