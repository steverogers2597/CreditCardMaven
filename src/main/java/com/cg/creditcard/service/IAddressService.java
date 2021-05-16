package com.cg.creditcard.service;

import com.cg.creditcard.entity.Address;
import com.cg.creditcard.model.AddressDTO;

public interface IAddressService {
	
	AddressDTO addAddress(AddressDTO addressdto);
	AddressDTO updateAddress(AddressDTO addressdto);
	AddressDTO deleteAddress(AddressDTO addressdto);
	
}
