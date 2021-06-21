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

import com.plasticon.erp.model.ViewStudents;
import com.plasticon.erp.service.ViewStudentsService;

@RestController
@RequestMapping("/viewstudents")
public class ViewStudentsController {

	@Autowired
	ViewStudentsService viewStudentsService;

	@RequestMapping(value = "/getViewStudentsDetails", method = RequestMethod.GET)
	public List<ViewStudents> getViewStudents() {
		return viewStudentsService.getViewStudents();

	}

	@PostMapping(value = "/saveViewStudentsDetails", consumes = "application/json")
	public void saveViewStudents(@RequestBody ViewStudents viewstudents) {
		viewStudentsService.saveViewStudents(viewstudents);

	}

	@DeleteMapping(value = "/removeViewStudents/{id}")
	public void removeViewStudents(@PathVariable("id") int Id) {
		viewStudentsService.removeViewStudents(Id);
	}

}
