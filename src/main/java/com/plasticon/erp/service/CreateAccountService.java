package com.plasticon.erp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.CreateAccount;
import com.plasticon.erp.repository.CreateAccountRepository;

@Service
public class CreateAccountService {
@Autowired
CreateAccountRepository createAccountRepository;

	public List<CreateAccount> getCreateAccountDetails(){
		return createAccountRepository.findAll();
	}
	public void saveCreateAccountDetails(CreateAccount createAccount) {
		createAccountRepository.save(createAccount);
	}
	public void deleteCreateAccountDetails(int accountId) {
		createAccountRepository.deleteById(accountId);
	}
}

