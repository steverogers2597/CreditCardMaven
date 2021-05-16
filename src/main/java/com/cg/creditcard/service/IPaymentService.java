package com.cg.creditcard.service;

import com.cg.creditcard.entity.Payment;
import com.cg.creditcard.model.PaymentDTO;

public interface IPaymentService {
	PaymentDTO addPayment(PaymentDTO paymentdto);
	PaymentDTO removePayment(long id);
	PaymentDTO updatePayment(long id,PaymentDTO paymentdto);
	PaymentDTO getPayment(long id);
}
