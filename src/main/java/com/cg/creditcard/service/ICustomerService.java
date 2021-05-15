package com.cg.creditcard.service;

import java.util.List;

import com.cg.creditcard.entity.Customer;

public interface ICustomerService{
	Customer addCustomer(Customer customer);
	Customer removeCustomer(long custId);
	Customer updateCustomer(long custId,Customer customer);
	Customer getCustomer(long custId);
	List<Customer> getAllCustomers();
}
