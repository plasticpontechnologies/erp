package com.plasticon.erp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.AccountStatement;
import com.plasticon.erp.repository.AccountStatementRepository;

@Service
public class AccountStatementService {
@Autowired
AccountStatementRepository accountStatementRepository;

public List<AccountStatement> getAccountStatementDetails(){
	return accountStatementRepository.findAll();
}
public void saveAccountStatementDetails(AccountStatement accountStatement) {
	accountStatementRepository.save(accountStatement);
}
public void deleteAccountStatementDetails(int accountStatementId) {
	accountStatementRepository.deleteById(accountStatementId);
}
}
