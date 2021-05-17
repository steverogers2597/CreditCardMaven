package com.cg.creditcard.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.creditcard.entity.Customer;
import com.cg.creditcard.model.CustomerDTO;
import com.cg.creditcard.repository.CustomerRepository;
import com.cg.creditcard.utils.CustomerUtils;

@Service
public class CustomerService {
	@Autowired
	private CustomerRepository repo;
	
	public List<CustomerDTO> getAllCustomers(){
		List<Customer> cList= repo.findAll();
		List<CustomerDTO> dtoList = CustomerUtils.convertToCustomerDtoList(cList);
		return dtoList;
	}
}
