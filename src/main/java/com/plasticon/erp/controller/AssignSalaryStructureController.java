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

import com.plasticon.erp.model.AssignSalaryStructure;
import com.plasticon.erp.service.AssignSalaryStructureService;
@RestController
@RequestMapping(value="/assignsalarystructure")
public class AssignSalaryStructureController {
	@Autowired
	AssignSalaryStructureService assignSalaryStructureService;
	
	
	@GetMapping(value="/getassignsalarystructuredetails")
	public List<AssignSalaryStructure> getAssignSalaryStructure(){
		return assignSalaryStructureService.getAssignSalaryStructure();
	}
	
	
	@PostMapping(value="/saveassignsalarystructuredetails",consumes="application/json")
	public void saveAssignSalaryStructure(@RequestBody AssignSalaryStructure assignSalaryStructure) {
		assignSalaryStructureService.saveAssignSalaryStructure(assignSalaryStructure);
	}
	
	
	@DeleteMapping(value="/deleteassignsalarystructure/{id}")
	public void deleteAssignSalaryStructure(@PathVariable int assignSalaryStructureId) {
		assignSalaryStructureService.deleteAssignSalaryStructure(assignSalaryStructureId);
	}
}
