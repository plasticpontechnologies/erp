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

import com.plasticon.erp.model.DefineFeeType;
import com.plasticon.erp.service.DefineFeeTypeService;

@RestController
@RequestMapping("/definefeetype")
public class DefineFeeTypeController {
	@Autowired
	private DefineFeeTypeService defineFeeTypeService;
	
	@RequestMapping(value = "/getDefineFeeTypeDetails", method = RequestMethod.GET)
	public List<DefineFeeType> getDefineFeeType() {
		return defineFeeTypeService.getDefineFeeType();

	}

	@PostMapping(value = "/saveDefineFeeTypeDetails", consumes = "application/json")
	public void saveDefineFeeType(@RequestBody DefineFeeType defineFeeType) {
		defineFeeTypeService.saveDefineFeeType(defineFeeType);

	}

	@DeleteMapping(value = "/removeDefineFeeTypeDetails/{id}")
	public void removeDefineFeeType(@PathVariable("id") int Id) {
		defineFeeTypeService.removeDefineFeeType(Id);
	}

}
