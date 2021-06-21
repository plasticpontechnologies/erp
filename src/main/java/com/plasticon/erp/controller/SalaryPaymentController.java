package com.plasticon.erp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.plasticon.erp.model.SalaryPayment;
import com.plasticon.erp.service.SalaryPaymentService;

@RestController
@RequestMapping(value="/salarypayment")
public class SalaryPaymentController {
@Autowired
SalaryPaymentService salaryPaymentService;
@GetMapping(value="/getsalarypayment")
public List<SalaryPayment> getSalaryPaymentDetails(){
	return salaryPaymentService.getSalaryPaymentDetails();
	}
@PostMapping(value="/savesalarypayment",consumes="application/json")
public void saveSalaryPaymentDetails(@RequestBody SalaryPayment salaryPayment) {
	salaryPaymentService.saveSalaryPaymentDetails(salaryPayment);
}
	@DeleteMapping(value="/deletesalarypayment/{salaryPaymentId}")
	public void deleteSalaryPaymentDetails(int salaryPaymentId) {
		salaryPaymentService.deleteSalaryPaymentDetails(salaryPaymentId);
	
}
}
