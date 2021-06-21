package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.StudentReview;
import com.plasticon.erp.repository.StudentReviewRepository;

@Service
public class StudentReviewService {
	@Autowired
	private StudentReviewRepository StudentReviewRepository;
	
	public List<StudentReview> getStudentReview() {
		return StudentReviewRepository.findAll();

	}

	public void saveStudentReview(StudentReview studentReview) {
		StudentReviewRepository.save(studentReview);
	}

	@Transactional
	public void removeStudentReview(int id) {
		StudentReviewRepository.deleteById(id);
	}

	
	

}
