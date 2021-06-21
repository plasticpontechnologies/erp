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
import com.plasticon.erp.model.SalaryHead;
import com.plasticon.erp.service.SalaryHeadService;

@RestController
@RequestMapping(value="/salaryhead")
public class SalaryHeadController {
	@Autowired
	SalaryHeadService salaryHeadService;


	@GetMapping(value="/getsalaryhead")
	public List<SalaryHead> getSalaryHeadDetails(){
		return salaryHeadService.getSalaryHeadDetails();
	}
	@PostMapping(value="/savesalaryhead",consumes="application/json")
	public void saveSalaryHeadDetails(@RequestBody SalaryHead salaryHead) {
		salaryHeadService.saveSalaryHeadDetails(salaryHead);
	}
	@DeleteMapping(value="/deletesalaryhead/{salaryHeadId}")
	public void deleteSalaryHeadDetails(@PathVariable int salaryHeadId) {
		salaryHeadService.deleteSalaryHeadDetails(salaryHeadId);
	}
}
