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

import com.plasticon.erp.model.StudentList;
import com.plasticon.erp.service.StudentListService;

@RestController
@RequestMapping("/studentlist")
public class StudentListController {
	@Autowired
	private StudentListService studentListService;
	
	@RequestMapping(value = "/getStudentListDetails", method = RequestMethod.GET)
	public List<StudentList> getStudentList() {
		return studentListService.getStudentList();

	}

	@PostMapping(value = "/saveStudentListDetails", consumes = "application/json")
	public void saveStudentList(@RequestBody StudentList studentList) {
		studentListService.saveStudentList(studentList);

	}

	@DeleteMapping(value = "/removeStudentList/{id}")
	public void removeStudentList(@PathVariable("id") int Id) {
		studentListService.removeStudentList(Id);
	}

	
	

}
