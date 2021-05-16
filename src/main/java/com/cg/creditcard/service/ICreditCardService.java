package com.cg.creditcard.service;

import java.util.List;

import com.cg.creditcard.entity.CreditCard;
import com.cg.creditcard.model.CreditCardDTO;

public interface ICreditCardService {
	CreditCardDTO addCreditCard(CreditCardDTO creditCarddto);
	CreditCardDTO removeCreditCard(long cardId);
	CreditCardDTO updateCreditCard(long cardId,CreditCardDTO card);
	CreditCardDTO getCreditCard(long cardId);
	List<CreditCardDTO> getAllCreditCards();
	
}
