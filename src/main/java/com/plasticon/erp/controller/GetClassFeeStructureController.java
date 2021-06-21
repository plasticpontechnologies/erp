package com.plasticon.erp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.plasticon.erp.model.GetClassFeeStructure;
import com.plasticon.erp.service.GetClassFeeStructureService;

@RestController
@RequestMapping("/getclassfeesstructure")
public class GetClassFeeStructureController {
	@Autowired
	private GetClassFeeStructureService getClassFeeStructureService;
	
	@RequestMapping(value = "/getGetClassFeeStructureDetails", method = RequestMethod.GET)
	public List<GetClassFeeStructure> getGetClassFeeStructure() {
		return getClassFeeStructureService.getGetClassFeeStructure();

	}

	@PostMapping(value = "/saveGetClassFeeStructureDetails", consumes = "application/json")
	public void saveGetClassFeeStructure(@RequestBody GetClassFeeStructure getClassFeeStructure) {
		getClassFeeStructureService.saveGetClassFeeStructure(getClassFeeStructure);

	}

	@DeleteMapping(value = "/removeGetClassFeeStructure/{id}")
	public void removeGetClassFeeStructure(@PathVariable("id") int Id) {
		getClassFeeStructureService.removeGetClassFeeStructure(Id);
	}
	

}
