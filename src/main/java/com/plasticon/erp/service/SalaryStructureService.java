package com.plasticon.erp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.SalaryStructure;
import com.plasticon.erp.repository.SalaryStructureRepository;

@Service
public class SalaryStructureService {
@Autowired
SalaryStructureRepository salaryStructureRepository;

public List<SalaryStructure> getSalaryStructureDetails(){
	return salaryStructureRepository.findAll();
	}
public void saveSalaryStructureDetails(SalaryStructure salaryStructure) {
	salaryStructureRepository.save(salaryStructure);
}
public void deleteSalaryStructureDetailsById(int salaryStructureId) {
	salaryStructureRepository.deleteById(salaryStructureId);
}
}
