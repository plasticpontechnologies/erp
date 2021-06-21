package com.plasticon.erp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.ExpenseHead;
import com.plasticon.erp.repository.ExpenseHeadRepository;

@Service
public class ExpenseHeadService {
@Autowired
ExpenseHeadRepository expenseHeadRepository;

	public List<ExpenseHead> getExpenseHeadDetails(){
		return expenseHeadRepository.findAll();
	}
	
	public void saveExpenseDetails(ExpenseHead expenseHead) {
		expenseHeadRepository.save(expenseHead);
	}
	
	public void deleteExpenseDetails(int expenseId) {
		expenseHeadRepository.deleteById(expenseId);
	}
}
