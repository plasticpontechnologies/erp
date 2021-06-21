package com.plasticon.erp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.plasticon.erp.model.RevertTransaction;
import com.plasticon.erp.repository.RevertTransactionRepository;

@Service
public class RevertTransactionService {
@Autowired
RevertTransactionRepository revertTransactionRepository;

public List<RevertTransaction> getRevertTransactionDetails(){
	return revertTransactionRepository.findAll();
}
public void saveRevertTransactionDetails(RevertTransaction revertTransaction) {
	revertTransactionRepository.save(revertTransaction);
}
public void deleteRevertTransactionDetails(int revertTransactionId) {
	revertTransactionRepository.deleteById(revertTransactionId);
}
}
