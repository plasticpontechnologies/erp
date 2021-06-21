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

import com.plasticon.erp.model.FinanceRegister;
import com.plasticon.erp.service.FinanceRegisterService;

@RestController
@RequestMapping(value="/financeregister")
public class FinanceRegisterController {
@Autowired
FinanceRegisterService financeRegisterService;

@GetMapping(value="/getfinanceregisterdetails")
public List<FinanceRegister> getFinanceRegisterDetails(){
	return financeRegisterService.getFinanceRegisterDetails();
}
@PostMapping(value="/savefinanceregisterdetails",consumes="application/json")
public void saveFinanceRegisterDetails(@RequestBody FinanceRegister financeRegister) {
	financeRegisterService.saveFinanceRegisterDetails(financeRegister);
}
@DeleteMapping(value="/deletefinanceregisterdetails/{financeRegisterId}")
public void deleteFinanceRegisterDetails(@PathVariable int financeRegisterId) {
	financeRegisterService.deleteFinanceRegisterDetails(financeRegisterId);
}

}
