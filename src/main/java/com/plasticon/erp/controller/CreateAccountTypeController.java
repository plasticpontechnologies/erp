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

import com.plasticon.erp.model.CreateAccountType;
import com.plasticon.erp.service.CreateAccountTypeService;

@RestController
@RequestMapping(value="/financeAccountType")
public class CreateAccountTypeController {
	@Autowired
	CreateAccountTypeService createAccountTypeService;
	
	
	@GetMapping(value="/getaccounttype")
	public List<CreateAccountType> getAccountTypeDetails() {
		return createAccountTypeService.getAccountTypeDetails();
	}
	
	@PostMapping(value="/saveaccounttype",consumes="application/json")
	public void saveAccountTypeDetails(@RequestBody CreateAccountType createAccountType) {
		createAccountTypeService.createAccountType(createAccountType);
	}
	
	@DeleteMapping(value="/deleteAccountType")
	public void deleteAccountType(@PathVariable int id) {
		createAccountTypeService.deleteAccounttypeById(id);
	}
}
