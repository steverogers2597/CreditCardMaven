package com.cg.creditcard.service;

import com.cg.creditcard.entity.Address;

public interface IAddressService {
	
	Address addAddress(Address address);
	Address updateAddress(Address address);
	Address deleteAddress(Address address);
}
