package com.plasticon.erp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.plasticon.erp.model.SalaryPaymentDetails;
import com.plasticon.erp.repository.SalaryPaymentDetailsRepository;

@Service
public class SalaryPaymentDetailsService {
@Autowired
SalaryPaymentDetailsRepository salaryPaymentDetailsRepository;


public List<SalaryPaymentDetails> getSalaryPaymentDetails(){
	return salaryPaymentDetailsRepository.findAll();
	}

public void saveSalaryPaymentDetails(SalaryPaymentDetails salaryPaymentDetails) {
	salaryPaymentDetailsRepository.save(salaryPaymentDetails);
}

public void deleteSalaryPaymentDetails(int salaryPaymentDetailsId) {
	salaryPaymentDetailsRepository.deleteById(salaryPaymentDetailsId);
}
}
