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

import com.plasticon.erp.model.CreateSyllabus;
import com.plasticon.erp.service.CreateSyllabusService;

@RestController
@RequestMapping("/createsyllabus")
public class CreateSyllabusController {
	@Autowired
	private CreateSyllabusService createSyllabusService;
	
	@RequestMapping(value = "/getCreateSyllabusDetails", method = RequestMethod.GET)
	public List<CreateSyllabus> getCreateSyllabus() {
		return createSyllabusService.getCreateSyllabus();

	}

	@PostMapping(value = "/saveCreateSyllabusDetails", consumes = "application/json")
	public void saveCreateSyllabus(@RequestBody CreateSyllabus createSyllabus) {
		createSyllabusService.saveCreateSyllabus(createSyllabus);

	}

	@DeleteMapping(value = "/removeCreateSyllabus/{id}")
	public void removeCreateSyllabus(@PathVariable("id") int Id) {
		createSyllabusService.removeCreateSyllabus(Id);
	}

}
