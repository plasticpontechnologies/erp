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

import com.plasticon.erp.model.ViewSyllabus;
import com.plasticon.erp.service.ViewSyllabusService;

@RestController
@RequestMapping("/viewsyllabus")
public class ViewSyllabusController {
	@Autowired
	private ViewSyllabusService viewSyllabusService;
	
	@RequestMapping(value = "/getViewSyllabus", method = RequestMethod.GET)
	public List<ViewSyllabus> getViewSyllabus() {
		return viewSyllabusService.getViewSyllabus();

	}

	@PostMapping(value = "/saveViewSyllabus", consumes = "application/json")
	public void saveViewSyllabus(@RequestBody ViewSyllabus viewSyllabus) {
		viewSyllabusService.saveViewSyllabus(viewSyllabus);

	}

	@DeleteMapping(value = "/removeViewSyllabus/{id}")
	public void removeViewSyllabus(@PathVariable("id") int Id) {
		viewSyllabusService.removeViewSyllabus(Id);
	}

}
