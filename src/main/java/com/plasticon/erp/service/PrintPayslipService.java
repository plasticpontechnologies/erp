package com.plasticon.erp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.PrintPayslip;
import com.plasticon.erp.repository.PrintPayslipRepository;

@Service
public class PrintPayslipService {
@Autowired
PrintPayslipRepository printPayslipRepository;

public List<PrintPayslip> getPrintPayslipDetails(){
	return printPayslipRepository.findAll();
}
public void savePrintPayslipDetails(PrintPayslip printPayslip) {
	printPayslipRepository.save(printPayslip);
}
public void deletePrintPayslipDetails(int printPayslipId) {
	printPayslipRepository.deleteById(printPayslipId);
}
}
