package com.cg.creditcard.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.creditcard.model.StatementDTO;
import com.cg.creditcard.repository.StatementRepository;
import com.cg.creditcard.utils.StatementUtils;

@Service
public class StatementService {
	@Autowired
	StatementRepository repo;
	
	public List< StatementDTO> getAllStatements(){
		List<com.cg.creditcard.entity.Statement> statemnentList= repo.findAll();
		List<StatementDTO> statemnentDtoList = StatementUtils.convertToStatementDtoList(statemnentList);
		return statemnentDtoList;
	}
	
	public StatementDTO getStatement(long statementId) {
		StatementDTO statementDTO =new StatementDTO();
		Optional<com.cg.creditcard.entity.Statement> optional = repo.findById(statementId);
		if(optional.isPresent()) {
			com.cg.creditcard.entity.Statement statement=optional.get();
			statementDTO= StatementUtils.convertToStatementDto(statement);
		}
		return statementDTO;
	}
	
	public void addStatement(StatementDTO statementDTO) {
		
		repo.saveAndFlush(StatementUtils.convertToStatement(statementDTO));
		
	}
	
	public void removeStatement(long statementId) {
		
		repo.deleteById(statementId);
	}
	
	void updateStatement(long statementId,StatementDTO statementDTO) {
		
		Optional<com.cg.creditcard.entity.Statement> optional = repo.findById(statementId);
		if(optional.isPresent()) {
			com.cg.creditcard.entity.Statement statemnentList=optional.get();
			repo.save(StatementUtils.convertToStatement(statementDTO));
			
		}
	}

}
