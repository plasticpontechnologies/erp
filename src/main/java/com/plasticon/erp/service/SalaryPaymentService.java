package com.plasticon.erp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.SalaryPayment;
import com.plasticon.erp.repository.SalaryPaymentRepository;

@Service
public class SalaryPaymentService {
@Autowired
SalaryPaymentRepository salaryPaymentRepository;


public List<SalaryPayment> getSalaryPaymentDetails(){
	return salaryPaymentRepository.findAll();
	}

public void saveSalaryPaymentDetails(SalaryPayment salaryPayment) {
	salaryPaymentRepository.save(salaryPayment);
}

public void deleteSalaryPaymentDetails(int salaryPaymentId) {
	salaryPaymentRepository.deleteById(salaryPaymentId);
}
}
