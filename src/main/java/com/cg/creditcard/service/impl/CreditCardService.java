package com.cg.creditcard.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.creditcard.entity.CreditCard;
import com.cg.creditcard.entity.Customer;
import com.cg.creditcard.model.CreditCardDTO;
import com.cg.creditcard.model.CustomerDTO;
import com.cg.creditcard.repository.CreditCardRepository;
import com.cg.creditcard.utils.CreditCardUtills;
import com.cg.creditcard.utils.CustomerUtils;


@Service
public class CreditCardService {
	
	@Autowired
	CreditCardRepository repo;
	
	public List<CreditCardDTO> getAllCreditCards(){
		List<CreditCard> credList= repo.findAll();
		List<CreditCardDTO> credDtoList = CreditCardUtills.convertToCreditCardDtoList(credList);
		return credDtoList;
	}
	
	public CreditCardDTO getCreditCard(long cardId) {
		CreditCardDTO creditCardDto =new CreditCardDTO();
		Optional<CreditCard> optional = repo.findById(cardId);
		if(optional.isPresent()) {
			CreditCard creditCard=optional.get();
			creditCardDto= CreditCardUtills.convertToCreditCardDto(creditCard);
		}
		return creditCardDto;
	}
	
	public void addCreditCard(CreditCardDTO creditCarddto) {
		
		repo.saveAndFlush(CreditCardUtills.convertToCreditCard(creditCarddto));
		
	}
	
	public void removeCreditCard(long cardId) {
		
		repo.deleteById(cardId);
	}
	
	void updateCreditCard(long cardId,CreditCardDTO card) {
		
		Optional<CreditCard> optional = repo.findById(cardId);
		if(optional.isPresent()) {
			CreditCard customer=optional.get();
			repo.save(CreditCardUtills.convertToCreditCard(card));
			
		}
	}
}
