package com.plasticon.erp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.plasticon.erp.model.RecordExpense;
import com.plasticon.erp.repository.RecordExpenseRepository;

@Service
public class RecordExpenseService {
@Autowired
RecordExpenseRepository recordExpenseRepository;

public List<RecordExpense> getRecordExpenseDetails(){
	return recordExpenseRepository.findAll();
}
public void saveRecordExpenseDetails(RecordExpense recordExpense) {
	recordExpenseRepository.save(recordExpense);
}
public void deleteRecordExpenseDetails(int recordExpenseId) {
	recordExpenseRepository.deleteById(recordExpenseId);
}
}
