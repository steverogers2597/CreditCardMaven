package com.cg.creditcard.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cg.creditcard.entity.Payment;
import com.cg.creditcard.model.PaymentDTO;
import com.cg.creditcard.repository.PaymentRepository;
import com.cg.creditcard.utils.PaymentUtils;

@Service
public class PaymentService {
	
	@Autowired
	PaymentRepository repo;
	
	public PaymentDTO getPayment(long PaymentId) {
		PaymentDTO paymentDTO =new PaymentDTO();
		Optional<Payment> optional = repo.findById(PaymentId);
		if(optional.isPresent()) {
			Payment payment=optional.get();
			paymentDTO= PaymentUtils.convertToPaymentDto(payment);
		}
		return paymentDTO;
	}
	
	public void addCreditCard(PaymentDTO paymentDTO) {
		
		repo.saveAndFlush(PaymentUtils.convertToPayment(paymentDTO));
		
	}
	
	public void removePayment(long PaymentId) {
		
		repo.deleteById(PaymentId);
	}
	
	void updatePayment(long PaymentId,PaymentDTO paymentDTO) {
		
		Optional<Payment> optional = repo.findById(PaymentId);
		if(optional.isPresent()) {
			Payment payment=optional.get();
			repo.save(PaymentUtils.convertToPayment(paymentDTO));
			
		}
	}

}
