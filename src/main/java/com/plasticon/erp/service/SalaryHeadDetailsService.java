package com.plasticon.erp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.plasticon.erp.model.SalaryHeadDetails;
import com.plasticon.erp.repository.SalaryHeadDetailsRepository;

@Service
public class SalaryHeadDetailsService {
@Autowired
SalaryHeadDetailsRepository salaryHeadDetailsRepository;

public List<SalaryHeadDetails> getSalaryHeadDetails(){
	return salaryHeadDetailsRepository.findAll();
}
public void saveSalaryHeadDetails(SalaryHeadDetails salaryHeadDetails) {
	salaryHeadDetailsRepository.save(salaryHeadDetails);
}
public void deleteSalaryHeadDetails(int headDetailsId) {
	salaryHeadDetailsRepository.deleteById(headDetailsId);
}
}
