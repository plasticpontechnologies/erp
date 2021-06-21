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
import com.plasticon.erp.model.RecordIncome;
import com.plasticon.erp.service.RecordIncomeService;

@RestController
@RequestMapping(value="/recordincome")
public class RecordIncomeController {
	@Autowired
	RecordIncomeService recordIncomeService;
	
	@GetMapping(value="/getrecordincomedetails")
	public List<RecordIncome> getRecordIncomeDetails(){
		return recordIncomeService.getRecordIncomeDetails();
	}
	
	
	@PostMapping(value="/saverecordincomedetails",consumes="application/json")
	public void saveRecordIncomeDetails(@RequestBody RecordIncome recordIncome) {
		recordIncomeService.saveRecordIncometDetails(recordIncome);
	}
	
	
	@DeleteMapping(value="/deleterecordincomedetails/{recordIncomeId}")
	public void deleteRecordIncomeDetails(@PathVariable int recordIncomeId) {
		recordIncomeService.deleteRecordIncomeDetails(recordIncomeId);
	}

}
