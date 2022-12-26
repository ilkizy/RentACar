package com.bilgeadam.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Table(name = "tblrent")
@Entity
public class Rent {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long id;
	@Temporal(TemporalType.DATE)
	private Date rentingDate;
	@Temporal(TemporalType.TIMESTAMP)
	private Date transactionDate;

	public Rent() {
		super();
	}

	public Rent(Date rentingDate, Date transactionDate) {
		super();
		this.rentingDate = rentingDate;
		this.transactionDate = transactionDate;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getRentingDate() {
		return rentingDate;
	}

	public void setRentingDate(Date rentingDate) {
		this.rentingDate = rentingDate;
	}

	public Date getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}

	@Override
	public String toString() {
		return "Rent [id=" + id + ", rentingDate=" + rentingDate + ", transactionDate=" + transactionDate + "]";
	}

}
