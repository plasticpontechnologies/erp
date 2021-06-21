package com.plasticon.erp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.plasticon.erp.model.PendingTransaction;
import com.plasticon.erp.service.PendingTransactionService;

@RestController
@RequestMapping("/transaction")
public class PendingTransactionController {
	@Autowired
	private PendingTransactionService pendingTransactionService;
	
	@RequestMapping(value = "/getPendingTransactionDetails", method = RequestMethod.GET)
	public List<PendingTransaction> getPendingTransaction() {
		return pendingTransactionService.getPendingTransaction();

	}

	@PostMapping(value = "/savePendingTransactionDetails", consumes = "application/json")
	public void savePendingTransaction(@RequestBody PendingTransaction pendingTransaction) {
		pendingTransactionService.savePendingTransaction(pendingTransaction);

	}

	@DeleteMapping(value = "/removePendingTransaction/{id}")
	public void removePendingTransaction(@PathVariable("id") int Id) {
		pendingTransactionService.removePendingTransaction(Id);
	}
}
