package com.plasticon.erp.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.plasticon.erp.model.StudentFeeRegister;
import com.plasticon.erp.service.StudentFeeRegisterService;

@RestController
@RequestMapping("/studentfeeregister")
public class StudentFeeRegisterController {
	
	private StudentFeeRegisterService studentFeeRegisterService;
	
	@RequestMapping(value = "/getStudentFeeRegisterDetails", method = RequestMethod.GET)
	public List<StudentFeeRegister> getStudentFeeRegister() {
		return studentFeeRegisterService.getStudentFeeRegister();

	}

	@PostMapping(value = "/saveStudentFeeRegisterDetails", consumes = "application/json")
	public void saveStudentFeeRegister(@RequestBody StudentFeeRegister studentFeeRegister) {
		studentFeeRegisterService.saveStudentFeeRegister(studentFeeRegister);

	}

	@DeleteMapping(value = "/removeStudentFeeRegister/{id}")
	public void removeStudentFeeRegister(@PathVariable("id") int Id) {
		studentFeeRegisterService.removeStudentFeeRegister(Id);
	}

}
