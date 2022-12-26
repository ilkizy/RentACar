package com.bilgeadam.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table(name = "tblcar")
@Entity
public class Car {

	public Car(String brand, String model, String plaque) {
		super();
		this.brand = brand;
		this.model = model;
		this.plaque = plaque;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long id;
	private String brand;
	private String model;
	private String plaque;

	@ManyToOne
	private Employee employee;

	public Car() {
		super();
	}

	public Car(String brand, String model, String plaque, Employee employee) {
		super();
		this.brand = brand;
		this.model = model;
		this.plaque = plaque;
		this.employee = employee;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getPlaque() {
		return plaque;
	}

	public void setPlaque(String plaque) {
		this.plaque = plaque;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", brand=" + brand + ", model=" + model + ", plaque=" + plaque + ", employee="
				+ employee + "]";
	}

}
