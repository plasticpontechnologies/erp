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

import com.plasticon.erp.model.StaffDetails;
import com.plasticon.erp.model.StudentDetails;
import com.plasticon.erp.service.StudentService;


@RestController
@RequestMapping("/student")
public class StudentController {
	
@Autowired
	StudentService studentService;

	@RequestMapping(value = "/getStudentDetails", method = RequestMethod.GET)
	public List<StudentDetails>  getStudentData() {
		return studentService.getStudentDetails();

	}
	
	  @PostMapping(value = "/saveStudentDetails", consumes = "application/json")
		public void saveStudentDetails(@RequestBody StudentDetails student) {
			studentService.saveStudentDetails(student);

		}
		

	  @DeleteMapping(value ="/removeStudentDetails/{fullname}")
	    public void removeStudentDetails(@PathVariable("fullname")StudentDetails fullName){
		  studentService.removeStudentDetails(fullName);
	    }

}
