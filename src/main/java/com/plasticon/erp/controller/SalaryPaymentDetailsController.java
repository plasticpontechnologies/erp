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

import com.plasticon.erp.model.SalaryPaymentDetails;
import com.plasticon.erp.service.SalaryPaymentDetailsService;

@RestController
@RequestMapping(value="/salarypaymentdetails")
public class SalaryPaymentDetailsController {
@Autowired
SalaryPaymentDetailsService salaryPaymentDetailsService;
@GetMapping(value="/getsalarypaymentdetails")
public List<SalaryPaymentDetails> getSalaryPaymentDetails(){
	return salaryPaymentDetailsService.getSalaryPaymentDetails();
	}
@PostMapping(value="/savesalarypaymentdetails",consumes="application/json")
public void saveSalaryPaymentDetails(@RequestBody SalaryPaymentDetails salaryPaymentDetails) {
	salaryPaymentDetailsService.saveSalaryPaymentDetails(salaryPaymentDetails);
}
	@DeleteMapping(value="/deletesalarypaymendetailst/{salaryPaymentDetailsId}")
	public void deleteSalaryPaymentDetails(@PathVariable int salaryPaymentDetailsId) {
		salaryPaymentDetailsService.deleteSalaryPaymentDetails(salaryPaymentDetailsId);
	}	
}