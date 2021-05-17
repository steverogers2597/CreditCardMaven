package com.cg.creditcard.service;

import java.util.List;

import com.cg.creditcard.entity.Customer;
import com.cg.creditcard.model.CustomerDTO;

public interface ICustomerService{
	void addCustomer(CustomerDTO customerdto);
	void removeCustomer(long custId);
	void updateCustomer(long custId,CustomerDTO customerdto);
	CustomerDTO getCustomer(long custId);
	List<CustomerDTO> getAllCustomers();
}
