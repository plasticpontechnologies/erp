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
import com.plasticon.erp.model.RevertTransaction;
import com.plasticon.erp.service.RevertTransactionService;

@RestController
@RequestMapping(value="/reverttransaction")
public class RevertTransactionController {
@Autowired
RevertTransactionService revertTransactionService;


@GetMapping(value="/getreverttransactiondetails")
public List<RevertTransaction> getRevertTransactionDetails(){
	return revertTransactionService.getRevertTransactionDetails();
}


@PostMapping(value="/savereverttransactiondetails",consumes="application/json")
public void saveRevertTransactionDetails(@RequestBody RevertTransaction revertTransaction) {
	revertTransactionService.saveRevertTransactionDetails(revertTransaction);
}


@DeleteMapping(value="/deletereverttransactiondetails/{revertTransactionId}")
public void deleteRevertTransactionDetails(@PathVariable int revertTransactionId) {
	revertTransactionService.deleteRevertTransactionDetails(revertTransactionId);
}

}
