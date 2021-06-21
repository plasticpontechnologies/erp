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

import com.plasticon.erp.model.ClassFees;
import com.plasticon.erp.service.ClassFeesService;

@RestController
@RequestMapping("/fees")
public class ClassFeesController {
	@Autowired
	private ClassFeesService classFeesService;
	
	@RequestMapping(value = "/getClassFeesDetails", method = RequestMethod.GET)
	public List<ClassFees> getClassFees() {
		return classFeesService.getClassFees();

	}

	@PostMapping(value = "/saveClassFeesDetails", consumes = "application/json")
	public void saveClassFees(@RequestBody ClassFees classFees) {
		classFeesService.saveClassFees(classFees);

	}

	@DeleteMapping(value = "/removeClassFees/{id}")
	public void removeClassFees(@PathVariable("id") int Id) {
		classFeesService.removeClassFees(Id);
	}

}
