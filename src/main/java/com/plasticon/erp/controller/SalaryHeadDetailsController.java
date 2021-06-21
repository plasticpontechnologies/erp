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

import com.plasticon.erp.model.SalaryHeadDetails;
import com.plasticon.erp.service.SalaryHeadDetailsService;

@RestController
@RequestMapping(value="/salaryheaddetails")
public class SalaryHeadDetailsController {
@Autowired
SalaryHeadDetailsService salaryHeadDetailsService;


@GetMapping(value="/getsalaryheaddetails")
public List<SalaryHeadDetails> getSalaryHeadDetails(){
	return salaryHeadDetailsService.getSalaryHeadDetails();
}
@PostMapping(value="/savesalaryheaddetails",consumes="application/json")
public void saveSalaryHeadDetails(@RequestBody SalaryHeadDetails salaryHeadDetails) {
	salaryHeadDetailsService.saveSalaryHeadDetails(salaryHeadDetails);
}
@DeleteMapping(value="/deletesalaryheaddetails/{headDetailsId}")
public void deleteSalaryHeadDetails(@PathVariable int headDetailsId) {
	salaryHeadDetailsService.deleteSalaryHeadDetails(headDetailsId);
}
}
