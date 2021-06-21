package com.plasticon.erp.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.plasticon.erp.model.StudentReview;
import com.plasticon.erp.service.StudentReviewService;

@RestController
@RequestMapping("/studentreview")
public class StudentReviewController {
	
	private StudentReviewService studentReviewService;
	
	@RequestMapping(value = "/getStudentReviewDetails", method = RequestMethod.GET)
	public List<StudentReview> getStudentReview() {
		return studentReviewService.getStudentReview();

	}

	@PostMapping(value = "/saveStudentReviewDetails", consumes = "application/json")
	public void saveStudentReview(@RequestBody StudentReview studentReview) {
		studentReviewService.saveStudentReview(studentReview);

	}

	@DeleteMapping(value = "/removeStudentReview/{id}")
	public void removeStudentReview(@PathVariable("id") int Id) {
		studentReviewService.removeStudentReview(Id);
	}

}
