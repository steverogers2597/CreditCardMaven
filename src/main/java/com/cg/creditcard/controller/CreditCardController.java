package com.cg.creditcard.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.cg.creditcard.service.ICreditCardService;

@RestController
public class CreditCardController {
	@Autowired
	ICreditCardService creditCardService;
}
