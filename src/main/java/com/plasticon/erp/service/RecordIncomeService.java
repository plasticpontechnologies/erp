package com.plasticon.erp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.plasticon.erp.model.RecordIncome;
import com.plasticon.erp.repository.RecordIncomeRepository;

@Service
public class RecordIncomeService {
@Autowired
RecordIncomeRepository recordIncomeRepository;

public List<RecordIncome> getRecordIncomeDetails(){
	return recordIncomeRepository.findAll();
}
public void saveRecordIncometDetails(RecordIncome recordIncome) {
	recordIncomeRepository.save(recordIncome);
}
public void deleteRecordIncomeDetails(int recordIncomeId) {
	recordIncomeRepository.deleteById(recordIncomeId);
}
}
