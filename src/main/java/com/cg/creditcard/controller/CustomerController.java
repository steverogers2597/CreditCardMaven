package com.cg.creditcard.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.cg.creditcard.service.ICustomerService;

@RestController
public class CustomerController {
	@Autowired
	ICustomerService customerService;
}
