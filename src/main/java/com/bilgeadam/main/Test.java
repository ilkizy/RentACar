package com.bilgeadam.main;

import java.util.Arrays;
import java.util.Date;

import com.bilgeadam.entity.Car;
import com.bilgeadam.entity.Department;
import com.bilgeadam.entity.Employee;
import com.bilgeadam.service.CarService;
import com.bilgeadam.service.DepartmentService;
import com.bilgeadam.service.EmployeeService;

public class Test {

	public static void main(String[] args) {

		Department department = new Department("BT");
		Car car = new Car("Volvo", "S60", "06 KJ 1258");

		DepartmentService departmentService = new DepartmentService();
		CarService carService = new CarService();

		departmentService.save(department);
		carService.save(car);

		Employee employee = new Employee("Ýlkiz", "Çabuk", new Date(), "1234567",
				Arrays.asList(car));

		EmployeeService employeeService = new EmployeeService();
		employeeService.save(employee);
	}

}
