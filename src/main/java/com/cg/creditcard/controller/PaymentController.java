package com.cg.creditcard.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.cg.creditcard.service.IPaymentService;

@RestController
public class PaymentController {
	@Autowired
	IPaymentService paymentService;
}
