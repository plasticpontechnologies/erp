package com.plasticon.erp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.IncomeHead;
import com.plasticon.erp.repository.IncomeHeadRepository;

@Service
public class IncomeHeadService {
@Autowired
IncomeHeadRepository incomeHeadRepository;

public List<IncomeHead> getIncomeHeadDetails(){
	return incomeHeadRepository.findAll();
}
public void saveIncomeHeadDetails(IncomeHead incomeHead) {
	incomeHeadRepository.save(incomeHead);
}
public void deleteIncomeHeadDetails(int incomeHeadId) {
	incomeHeadRepository.deleteById(incomeHeadId);
}
}
