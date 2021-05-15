package com.cg.creditcard.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Account")
public class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long accountId;
	private String accountName;
	private double balance;
	private String accountType;
	@ManyToOne
	@JoinColumn(name="user_id")
	private Customer customer;
	
	
	public Account(long accountId, String accountName, double balance, String accountType, Customer customer) {
		super();
		this.accountId = accountId;
		this.accountName = accountName;
		this.balance = balance;
		this.accountType = accountType;
		this.customer = customer;
	}


	public long getAccountId() {
		return accountId;
	}


	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}


	public String getAccountName() {
		return accountName;
	}


	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	public String getAccountType() {
		return accountType;
	}


	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}


	public Customer getCustomer() {
		return customer;
	}


	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", accountName=" + accountName + ", balance=" + balance
				+ ", accountType=" + accountType + ", customer=" + customer + "]";
	}

	
	
}