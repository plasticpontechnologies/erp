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
import com.plasticon.erp.model.AccountStatement;
import com.plasticon.erp.service.AccountStatementService;

@RestController
@RequestMapping(value="/accountstatement")
public class AccountStatementController {
@Autowired
AccountStatementService accountStatementService;

@GetMapping(value="/getaccountstatementdetails")
public List<AccountStatement> getAccountStatementDetails(){
	return accountStatementService.getAccountStatementDetails();
}


@PostMapping(value="/saveaccountstatementdetails",consumes="application/json")
public void saveAccountStatementDetails(@RequestBody AccountStatement accountStatement) {
	accountStatementService.saveAccountStatementDetails(accountStatement);
}


@DeleteMapping(value="/deleteaccountstatementdetails/{accountStatementId}")
public void deleteAccountStatementDetails(@PathVariable int accountStatementId) {
	accountStatementService.deleteAccountStatementDetails(accountStatementId);
}
}
