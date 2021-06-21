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
import com.plasticon.erp.model.PrintPayslip;
import com.plasticon.erp.service.PrintPayslipService;

@RestController
@RequestMapping(value="/printpayslip")
public class PrintPayslipController {
@Autowired
PrintPayslipService printPayslipService;
@GetMapping(value="/getprintpayslipdetails")
public List<PrintPayslip> getPrintPayslipDetails(){
	return printPayslipService.getPrintPayslipDetails();
}


@PostMapping(value="/saveprintpayslipdetails",consumes="application/json")
public void savePrintPayslipDetails(@RequestBody PrintPayslip printPayslip) {
	printPayslipService.savePrintPayslipDetails(printPayslip);
}


@DeleteMapping(value="/deleteprintpayslipdetails/{printPayslipId}")
public void deletePrintPayslipDetails(@PathVariable int printPayslipId) {
	printPayslipService.deletePrintPayslipDetails(printPayslipId);
}

}
