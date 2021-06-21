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

import com.plasticon.erp.model.StudentUpload;
import com.plasticon.erp.service.StudentUploadService;

@RestController
@RequestMapping("/studentupload")
public class StudentUploadController {
	@Autowired
	StudentUploadService studentUploadService;
	
	@RequestMapping(value = "/getStudentUploadDetails", method = RequestMethod.GET)
	public List<StudentUpload> getStudentUpload() {
		return studentUploadService.getStudentUpload();

	}

	@PostMapping(value = "/saveStudentUploadDetails", consumes = "application/json")
	public void saveStudentUpload(@RequestBody StudentUpload studentupload) {
		studentUploadService.saveStudentUpload(studentupload);

	}

	@DeleteMapping(value = "/removeStudentUpload/{id}")
	public void removeStudentUpload(@PathVariable("id") int Id) {
		studentUploadService.removeStudentUpload(Id);
	}
	

}
