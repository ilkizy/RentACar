package com.bilgeadam.service;

import com.bilgeadam.entity.Car;
import com.bilgeadam.repository.CarRepository;
import com.bilgeadam.utility.MyRepositoryService;

public class CarService extends MyRepositoryService<CarRepository, Car, Long> {

	public CarService() {
		super(new CarRepository());
	}

}
