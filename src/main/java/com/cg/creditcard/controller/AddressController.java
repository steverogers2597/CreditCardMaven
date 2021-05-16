package com.cg.creditcard.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.creditcard.model.AccountDTO;
import com.cg.creditcard.model.AddressDTO;
import com.cg.creditcard.service.IAddressService;

@RestController
public class AddressController {
	@Autowired
	IAddressService addressService;
	
	@PostMapping("/addAddress")
	public ResponseEntity addAddress(@RequestBody AddressDTO addressdto) {
		addressService.addAddress(addressdto);
		return new ResponseEntity("Address added successfully!",HttpStatus.OK);
	}
	@PutMapping("/updateAddress")
	public ResponseEntity updateAddress(@RequestBody AddressDTO addressdto) {
		addressService.updateAddress(addressdto);
		return new ResponseEntity("Account updated successfully!",HttpStatus.OK);
	}
	@DeleteMapping("/removeAddress")
	public ResponseEntity removeAccount(@RequestBody AddressDTO addressdto) {
		addressService.deleteAddress(addressdto);
		return new ResponseEntity("Account removed Successfully!",HttpStatus.OK);
	}
}
