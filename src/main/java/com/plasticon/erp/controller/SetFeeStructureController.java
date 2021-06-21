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

import com.plasticon.erp.model.SetFeeStructure;
import com.plasticon.erp.service.SetFeeStructureService;

@RestController
@RequestMapping("/setfeestructure")
public class SetFeeStructureController {
	@Autowired
	private SetFeeStructureService setFeeStructureService;

	@RequestMapping(value = "/getsetfeestructuredetails", method = RequestMethod.GET)
	public List<SetFeeStructure> getSetFeeStructure(){
		return setFeeStructureService.getSetFeeStructure();
	}
	
	@PostMapping(value = "/savesetfeestructuredetails", consumes = "application/json")
	public void saveSetFeeStructure(@RequestBody SetFeeStructure fee) {
		setFeeStructureService.saveSetFeeStructure(fee);
	}
	@DeleteMapping(value = "/removesetfeestructuredetails/{id}")
	public void removeSetFeeStructure(@PathVariable("Id") int id) {
		setFeeStructureService.removeSetFeeStructure(id);
	}

}
