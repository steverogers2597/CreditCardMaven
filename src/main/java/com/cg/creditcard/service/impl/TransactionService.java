package com.cg.creditcard.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.creditcard.entity.Customer;
import com.cg.creditcard.entity.Transaction;
import com.cg.creditcard.model.CustomerDTO;
import com.cg.creditcard.model.TransactionDTO;
import com.cg.creditcard.repository.TransactionRepository;
import com.cg.creditcard.utils.CustomerUtils;
import com.cg.creditcard.utils.TransactionUtils;

@Service
public class TransactionService {
	
	@Autowired
	private TransactionRepository repo;
	
	public List<TransactionDTO> getAllTransactions(){
		List<Transaction> tList= repo.findAll();
		List<TransactionDTO> dtoList = TransactionUtils.convertToTransactionDtoList(tList);
		return dtoList;
	}
	
	public TransactionDTO getTransactionDetails(long id) {
		TransactionDTO transactionDto =new TransactionDTO();
		Optional<Transaction> optional = repo.findById(id);
		if(optional.isPresent()) {
			Transaction transaction=optional.get();
			transactionDto= TransactionUtils.convertToTransactionDto(transaction);
		}
		return transactionDto;
	}
	
	public void addTransaction(TransactionDTO transactionDto) {
		
		repo.saveAndFlush(TransactionUtils.convertToTransaction(transactionDto));
		
	}
	
	public void removeTransaction(long id) {
		
		repo.deleteById(id);
		
	}
	
	public void updateTransaction(long id,TransactionDTO transactionDto) {
		Optional<Transaction> optional = repo.findById(id);
		if(optional.isPresent()) {
			Transaction transaction=optional.get();
			repo.save(TransactionUtils.convertToTransaction(transactionDto));
			
		}
		
	}
}
