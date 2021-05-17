package com.cg.creditcard.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Address")
public class Address {
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	private String doorNo;
	private String street;
	private String area;
	private String city;
	private String state;
	private int pincode;
	@OneToOne
	@JoinColumn(name="user_id")
	private Customer customer;
	
	public Address(String doorNo, String street, String area, String city, String state, int pincode,Customer customer) {
		super();
		this.doorNo = doorNo;
		this.street = street;
		this.area = area;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
		this.customer=customer;
	}

	public String getDoorNo() {
		return doorNo;
	}

	public void setDoorNo(String doorNo) {
		this.doorNo = doorNo;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Address [doorNo=" + doorNo + ", street=" + street + ", area=" + area + ", city=" + city + ", state="
				+ state + ", pincode=" + pincode + ", customer=" + customer + "]";
	}
	
	
}
