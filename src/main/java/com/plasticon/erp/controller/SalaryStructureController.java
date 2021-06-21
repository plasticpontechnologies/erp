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

import com.plasticon.erp.model.SalaryStructure;
import com.plasticon.erp.service.SalaryStructureService;

@RestController
@RequestMapping(value="/salarystructure")
public class SalaryStructureController {
@Autowired
SalaryStructureService salaryStructureService;
@GetMapping(value="/getsalarystructuredetails")
public List<SalaryStructure> getSalaryStructureDetails(){
	return salaryStructureService.getSalaryStructureDetails();
}
@PostMapping(value="/savesalarystructuredetails",consumes="application/json")
public void saveSalaryStructureDetails(@RequestBody SalaryStructure salaryStructure) {
	salaryStructureService.saveSalaryStructureDetails(salaryStructure);
}
@DeleteMapping(value="/deletesalarystructure/{salaryStructureId}")
public void deleteSalaryStructureDetailsById(@PathVariable int salaryStructureId) {
	salaryStructureService.deleteSalaryStructureDetailsById(salaryStructureId);
}
}
