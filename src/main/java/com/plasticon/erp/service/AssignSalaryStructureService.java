package com.plasticon.erp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.AssignSalaryStructure;
import com.plasticon.erp.repository.AssignSalaryStructureRepository;

@Service
public class AssignSalaryStructureService {
@Autowired
AssignSalaryStructureRepository assignSalaryStructureRepository;


public List<AssignSalaryStructure> getAssignSalaryStructure(){
	return assignSalaryStructureRepository.findAll();
}
public void saveAssignSalaryStructure(AssignSalaryStructure assignSalaryStructure) {
	assignSalaryStructureRepository.save(assignSalaryStructure);
}
public void deleteAssignSalaryStructure(int assignSalaryStructureId) {
	assignSalaryStructureRepository.deleteById(assignSalaryStructureId);
}
}
