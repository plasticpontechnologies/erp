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
import com.plasticon.erp.model.AccountBalanceTransfer;
import com.plasticon.erp.service.AccountBalanceTransferService;

@RestController
@RequestMapping(value="/accountbalancetransfer")
public class AccountBalanceTransferController {
@Autowired
AccountBalanceTransferService accountBalanceTransferService;

@GetMapping(value="/getaccountbalancedetails")
public List<AccountBalanceTransfer> getAccountBalanceTransferDetails(){
	return accountBalanceTransferService.getAccountBalanceTransferDetails();
	}


@PostMapping(value="/saveaccountbalancedetails",consumes="application/json")
public void saveAccountBalanceTransferDetails(@RequestBody AccountBalanceTransfer accountBalanceTransfer) {
	accountBalanceTransferService.saveAccountBalanceTransferDetails(accountBalanceTransfer);
}


@DeleteMapping(value="/deleteaccountbalancedetails/{accountBalanceTransferId}")
public void deleteAccountBalanceTransferDetails(@PathVariable int accountBalanceTransferId) {
	accountBalanceTransferService.deleteAccountBalanceTransferDetails(accountBalanceTransferId);
}
}
