package com.cg.creditcard.service.impl;

import java.util.List;
import java.util.Optional;

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
	
	public CustomerDTO getCustomer(long custId) {
		CustomerDTO customerDto =new CustomerDTO();
		Optional<Customer> optional = repo.findById(Long.toString(custId));
		if(optional.isPresent()) {
			Customer customer=optional.get();
			customerDto= CustomerUtils.convertToCustomerDto(customer);
		}
		return customerDto;
	}
	
	public void addCustomer(CustomerDTO customerdto) {
		
		repo.saveAndFlush(CustomerUtils.convertToCustomer(customerdto));
		
	}
	
	public void removeCustomer(long custId) {
		
		repo.deleteById(Long.toString(custId));
		
	}
	
	public void updateCustomer(long custId,CustomerDTO customerdto) {
		Optional<Customer> optional = repo.findById(Long.toString(custId));
		if(optional.isPresent()) {
			Customer customer=optional.get();
			repo.save(CustomerUtils.convertToCustomer(customerdto));
			
		}
		
	}
	
}
