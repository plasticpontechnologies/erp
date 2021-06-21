package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.PendingTransaction;
import com.plasticon.erp.repository.PendingTransactionRepository;

@Service
public class PendingTransactionService {
	@Autowired
	private PendingTransactionRepository pendingTransactionRepository;
	
	public List<PendingTransaction> getPendingTransaction() {
		return pendingTransactionRepository.findAll();

	}

	public void savePendingTransaction(PendingTransaction pendingTransaction) {
		pendingTransactionRepository.save(pendingTransaction);
	}

	@Transactional
	public void removePendingTransaction(int id) {
		pendingTransactionRepository.deleteById(id);
	}


}
