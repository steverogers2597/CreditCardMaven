package com.cg.creditcard.service;

import java.util.List;

import com.cg.creditcard.entity.Statement;
import com.cg.creditcard.model.StatementDTO;

public interface IStatementService {
	 StatementDTO addStatement(StatementDTO statementdto);
	 StatementDTO removeStatement(long id);
	 StatementDTO updateStatement(long id,StatementDTO statementdto);
	 StatementDTO getStatement(long id);
	List<StatementDTO> getAllStatements();
	
	
}
