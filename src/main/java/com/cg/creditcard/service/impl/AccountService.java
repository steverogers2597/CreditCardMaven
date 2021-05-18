package com.cg.creditcard.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.creditcard.entity.Account;
import com.cg.creditcard.model.AccountDTO;
import com.cg.creditcard.repository.AccountRepository;
import com.cg.creditcard.utils.AccountUtills;

@Service
public class AccountService {
	@Autowired
	AccountRepository repo;
	
	public List<AccountDTO> getAllAccounts(){
		List<Account> accountList= repo.findAll();
		List<AccountDTO> accountDtoList = AccountUtills.convertToAccountDtoList(accountList);
		return accountDtoList;
	}
	
	public AccountDTO getAccount(long Id) {
		AccountDTO accountDto =new AccountDTO();
		Optional<Account> optional = repo.findById(Id);
		if(optional.isPresent()) {
			Account account=optional.get();
			accountDto= AccountUtills.convertToAccountDto(account);
		}
		return accountDto;
	}
	
	public void addAccount(AccountDTO accountDto) {
		
		repo.saveAndFlush(AccountUtills.convertToAccount(accountDto));
		
	}
	
	public void removeAccount(long Id) {
		
		repo.deleteById(Id);
	}
	
	void updateAccount(long Id,AccountDTO accountDto) {
		
		Optional<Account> optional = repo.findById(Id);
		if(optional.isPresent()) {
			Account account=optional.get();
			repo.save(AccountUtills.convertToAccount(accountDto));
			
		}
	}

}
