package com.ox.bank.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	long id;
	String name;
	long mobileNo;
	String gender;
	String martialStatus;
	int creditScore;
	long salary;
	long expense;
	
	
	
	public Customer() {
		super();
	}

	public Customer(long id) {
		super();
		this.id = id;
	}

	public Customer(long id, String name, long mobileNo, String gender, String martialStatus, int creditScore,
			long salary, long expense) {
		super();
		this.id = id;
		this.name = name;
		this.mobileNo = mobileNo;
		this.gender = gender;
		this.martialStatus = martialStatus;
		this.creditScore = creditScore;
		this.salary = salary;
		this.expense = expense;
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
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getMartialStatus() {
		return martialStatus;
	}
	public void setMartialStatus(String martialStatus) {
		this.martialStatus = martialStatus;
	}
	public int getCreditScore() {
		return creditScore;
	}
	public void setCreditScore(int creditScore) {
		this.creditScore = creditScore;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public long getExpense() {
		return expense;
	}
	public void setExpense(long expense) {
		this.expense = expense;
	}
	
	
}
