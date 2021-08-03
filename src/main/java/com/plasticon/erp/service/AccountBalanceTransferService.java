 package com.plasticon.erp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.AccountBalanceTransfer;
import com.plasticon.erp.repository.AccountBalanceTransferRepository;

@Service
public class AccountBalanceTransferService {
@Autowired
AccountBalanceTransferRepository accountBalanceTransferRepository;

public List<AccountBalanceTransfer> getAccountBalanceTransferDetails(){
	return accountBalanceTransferRepository.findAll();
}
public void saveAccountBalanceTransferDetails(AccountBalanceTransfer accountBalanceTransfer) {
	accountBalanceTransferRepository.save(accountBalanceTransfer);
}
public void deleteAccountBalanceTransferDetails(int accountBalanceTransferId) {
	accountBalanceTransferRepository.deleteById(accountBalanceTransferId);
}
}
