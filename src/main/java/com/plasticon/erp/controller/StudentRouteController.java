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
import com.plasticon.erp.model.StudentRoute;
import com.plasticon.erp.service.StudentRouteService;

@RestController
@RequestMapping(value="/studentroute")
public class StudentRouteController {
@Autowired
StudentRouteService studentRouteService;
	
	@GetMapping(value="/getstudentroute")
	public List<StudentRoute> getStudentRouteDetails(){
		return studentRouteService.getStudentRouteDetails();
	}
	
	
	@PostMapping(value="/savestudentroute",consumes="application/json")
	public void saveStudentRouteDetails(@RequestBody StudentRoute studentRoute) {
		studentRouteService.saveStudentRouteDetails(studentRoute);
	}
	
	
	@DeleteMapping(value="/deletestudentroute/{studentRouteId}")
	public void deleteStudentRouteDetails(@PathVariable int studentRouteId) {
		studentRouteService.deleteStudentRouteDetailsById(studentRouteId);
	}
}
