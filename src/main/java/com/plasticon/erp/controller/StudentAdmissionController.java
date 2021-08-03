package com.plasticon.erp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.plasticon.erp.model.StudentAdmission;
import com.plasticon.erp.service.StudentAdmissiontService;



@RestController
@RequestMapping("/student")
public class StudentAdmissionController {
	

@Autowired

	StudentAdmissiontService studentService;


	@RequestMapping(value = "/getStudentDetails", method = RequestMethod.GET)
	public List<StudentAdmission>  getStudentData() {
		return studentService.getStudentDetails();

	}
	
	  @PostMapping(value = "/saveStudentDetails", consumes = "application/json")
		public void saveStudentDetails(@RequestBody StudentAdmission student) {
			studentService.saveStudentDetails(student);

		}
		

	  @DeleteMapping(value ="/removeStudentDetails/{id}")
	    public void removeStudentDetails(@PathVariable("id")int Id){
		  studentService.removeStudentDetails(Id);
	    
	    }

	  @GetMapping(value= "/getByAdmissionNumber")
	 public List<StudentAdmission> getAdmissionData(){
		 return studentService.findByAdmissionNumber();
		 }
	  
	  @GetMapping(value= "/getByStudentName")
		 public List<StudentAdmission> getStudentNameData(){
			 return studentService.findByStudentName();
			 }

	  @GetMapping(value="/getStudentDetailsById/{clasId}")
		public List<StudentAdmission> getStudentAdmission(@PathVariable("clasId")int clasId) {
			return studentService.findByClassId(clasId);
		}


}
