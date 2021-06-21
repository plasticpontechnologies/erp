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

import com.plasticon.erp.model.IncomeHead;
import com.plasticon.erp.service.IncomeHeadService;

@RestController
@RequestMapping(value="/incomehead")
public class IncomeHeadController {
@Autowired
IncomeHeadService incomeHeadService;


@GetMapping(value="/getincomeheaddetails")
public List<IncomeHead> getIncomeHeadDetails(){
	return incomeHeadService.getIncomeHeadDetails();
}
@PostMapping(value="/saveincomeheaddetails",consumes="application/json")
public void saveIncomeHeadDetails(@RequestBody IncomeHead incomeHead) {
	incomeHeadService.saveIncomeHeadDetails(incomeHead);
}
@DeleteMapping(value="/deleteincomeheaddetails/{incomeHeadId}")
public void deleteIncomeHeadDetails(@PathVariable int incomeHeadId) {
	incomeHeadService.deleteIncomeHeadDetails(incomeHeadId);
}
}
