package com.ox.bank.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;

@Entity
public class Loan {
	
	String temp;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	long loanAccountNumber;
	
	String loanStatus;
	long loanAmount;
	
	
	
	public Loan(long loanAccountNumber, String loanStatus, long loanAmount, Manager manager, Customer customer) {
		super();
		this.loanAccountNumber = loanAccountNumber;
		this.loanStatus = loanStatus;
		this.loanAmount = loanAmount;
		this.manager = manager;
		this.customer = customer;
	}

	@ManyToOne
	@JoinTable(name = "Manager", joinColumns = @JoinColumn(name = "id"))
	Manager manager;
	
	@ManyToOne
	@JoinTable(name = "Customer", joinColumns = @JoinColumn(name = "id"))
	Customer customer;

	public long getLoanAccountNumber() {
		return loanAccountNumber;
	}

	public void setLoanAccountNumber(long loanAccountNumber) {
		this.loanAccountNumber = loanAccountNumber;
	}

	public String getLoanStatus() {
		return loanStatus;
	}

	public void setLoanStatus(String loanStatus) {
		this.loanStatus = loanStatus;
	}

	public long getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(long loanAmount) {
		this.loanAmount = loanAmount;
	}

	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
}
