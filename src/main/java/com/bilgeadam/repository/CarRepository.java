package com.bilgeadam.repository;

import com.bilgeadam.entity.Car;
import com.bilgeadam.utility.MyRepository;

public class CarRepository extends MyRepository<Car, Long> {

	public CarRepository() {
		super(new Car());
	}

}
