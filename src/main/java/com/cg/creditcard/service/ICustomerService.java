package com.cg.creditcard.service;

import java.util.List;

import com.cg.creditcard.entity.Customer;
import com.cg.creditcard.model.CustomerDTO;

public interface ICustomerService{
	CustomerDTO addCustomer(CustomerDTO customerdto);
	CustomerDTO removeCustomer(long custId);
	CustomerDTO updateCustomer(long custId,CustomerDTO customerdto);
	CustomerDTO getCustomer(long custId);
	List<CustomerDTO> getAllCustomers();
}
