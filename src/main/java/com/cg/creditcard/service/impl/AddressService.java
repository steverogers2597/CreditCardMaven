package com.cg.creditcard.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cg.creditcard.entity.Address;
import com.cg.creditcard.entity.Customer;
import com.cg.creditcard.model.AddressDTO;
import com.cg.creditcard.model.CustomerDTO;
import com.cg.creditcard.repository.AddressRepository;
import com.cg.creditcard.utils.AddressUtils;
import com.cg.creditcard.utils.CustomerUtils;


@Service
public class AddressService {
	@Autowired
	AddressRepository repo;
	
	public List<AddressDTO> getAllAddresses(){
		List<Address> aList= repo.findAll();
		List<AddressDTO> dtoList = AddressUtils.convertToAddressDtoList(aList);
		return dtoList;
	}
	
	public AddressDTO getAddress(Integer addrId) {
		AddressDTO addressDto =new AddressDTO();
		Optional<Address> optional = repo.findById(addrId);
		if(optional.isPresent()) {
			Address address=optional.get();
			addressDto= AddressUtils.convertToAddressDto(address);
		}
		return addressDto;
	}
	
	public void addAddress(AddressDTO addressdto) {
		
		repo.saveAndFlush(AddressUtils.convertToAddress(addressdto));
		
	}
	
	public void  removeAddress(Integer addrId) {
		
		repo.deleteById(addrId);
		
	}
	
	public void updateAddress(Integer addrId,AddressDTO addressdto) {
		Optional<Address> optional = repo.findById(addrId);
		if(optional.isPresent()) {
			Address address=optional.get();
			repo.save(AddressUtils.convertToAddress(addressdto));
			
		}
		
	}
}
