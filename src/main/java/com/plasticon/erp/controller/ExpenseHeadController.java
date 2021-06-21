package com.plasticon.erp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.plasticon.erp.model.ExpenseHead;
import com.plasticon.erp.service.ExpenseHeadService;

@RestController
@RequestMapping(value="/expensehead")
public class ExpenseHeadController {

	@Autowired
	ExpenseHeadService expenseHeadService;
	@RequestMapping(value="/getexpensehead")
	public List<ExpenseHead> getExpenseHeadDetails(){
		return expenseHeadService.getExpenseHeadDetails();
	}
	@PostMapping(value="/saveexpensehead",consumes="application/json")
	public void saveExpenseHeadDetails(@RequestBody ExpenseHead expenseHead) {
		expenseHeadService.saveExpenseDetails(expenseHead);
	}
	@DeleteMapping(value="/deleteexpensehead/{expenseHeadId}")
	public void deleteExpenseHeadById(@PathVariable int expenseHeadId) {
		expenseHeadService.deleteExpenseDetails(expenseHeadId);
	}
}
