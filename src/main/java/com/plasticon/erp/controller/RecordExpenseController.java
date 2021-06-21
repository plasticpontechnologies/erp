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
import com.plasticon.erp.model.RecordExpense;
import com.plasticon.erp.service.RecordExpenseService;

@RestController
@RequestMapping(value="/recordexpense")
public class RecordExpenseController {
@Autowired
RecordExpenseService recordExpenseService;

@GetMapping(value="/getrecordexpensedetails")
public List<RecordExpense> getRecordExpenseDetails(){
	return recordExpenseService.getRecordExpenseDetails();
}


@PostMapping(value="/saverecordexpensedetails",consumes="application/json")
public void saveRecordExpenseDetails(@RequestBody RecordExpense recordExpense) {
	recordExpenseService.saveRecordExpenseDetails(recordExpense);
}


@DeleteMapping(value="/deleterecordexpensedetails/{recordExpenseId}")
public void deleteRecordExpenseDetails(@PathVariable int recordExpenseId) {
	recordExpenseService.deleteRecordExpenseDetails(recordExpenseId);
}

}
