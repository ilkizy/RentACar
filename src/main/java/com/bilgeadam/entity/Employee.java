package com.bilgeadam.entity;

import static javax.persistence.TemporalType.DATE;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;

@Table(name = "tblemployee")
@Entity
public class Employee {

	public Employee(String name, String surname, Date dateOfEmp, String identityNo, List<Car> cars) {
		super();
		this.name = name;
		this.surname = surname;
		this.dateOfEmp = dateOfEmp;
		this.identityNo = identityNo;
		this.cars = cars;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long id;
	private String name;
	private String surname;
	@Temporal(DATE)
	private Date dateOfEmp;
	private String identityNo;

//	@ManyToOne
//	private Department department;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Car> cars;

	public Employee() {
		super();
	}
//
//	public Employee(String name, String surname, Date date, String identityNo, Department department,
//			List<Car> cars) {
//		super();
//		this.name = name;
//		this.surname = surname;
//		this.dateOfEmp = date;
//		this.identityNo = identityNo;
//		this.department = department;
//		this.cars = cars;
//	}
//
//	public Department getDepartment() {
//		return department;
//	}
//
//	public void setDepartment(Department department) {
//		this.department = department;
//	}

	public List<Car> getCars() {
		return cars;
	}

	public void setCars(List<Car> cars) {
		this.cars = cars;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Date getDateOfEmp() {
		return dateOfEmp;
	}

	public void setDateOfEmp(Date dateOfEmp) {
		this.dateOfEmp = dateOfEmp;
	}

	public String getIdentityNo() {
		return identityNo;
	}

	public void setIdentityNo(String identityNo) {
		this.identityNo = identityNo;
	}
//
//	@Override
//	public String toString() {
//		return "Employee [id=" + id + ", name=" + name + ", surname=" + surname + ", dateOfEmp=" + dateOfEmp
//				+ ", identityNo=" + identityNo + ", department=" + department + ", cars=" + cars + "]";
//	}

}
