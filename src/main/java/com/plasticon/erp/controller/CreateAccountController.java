package com.plasticon.erp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.plasticon.erp.model.CreateAccount;
import com.plasticon.erp.service.CreateAccountService;

@RestController
@RequestMapping(value="/createaccount")
public class CreateAccountController {
	@Autowired
	CreateAccountService createAccountService;
	
	
	@GetMapping(value="/getaccountdetails")
	public List<CreateAccount> getCreateAccountDetails(){
		return createAccountService.getCreateAccountDetails();
	}
	
	
	@PostMapping(value="/saveaccountdetails",consumes="application/json")
	public void saveCreateAccountDetails(@RequestBody CreateAccount createAccount) {
		createAccountService.saveCreateAccountDetails(createAccount);
	}
	
	
	@DeleteMapping(value="/deleteaccountdetails/{accountId}")
	public void deleteAccountDetails(@PathVariable int accountId) {
		createAccountService.deleteCreateAccountDetails(accountId);
	}
}
