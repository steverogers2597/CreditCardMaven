package com.cg.creditcard.service;

import java.util.List;

import com.cg.creditcard.entity.Statement;

public interface IStatementService {
	 Statement addStatement(Statement statement);
	 Statement removeStatement(long id);
	 Statement updateStatement(long id,Statement statement);
	 Statement getStatement(long id);
	List<Statement> getAllStatements();
	List<Statement> getBilledStatements();
	List<Statement> getUnbilledStatements();
	
}
