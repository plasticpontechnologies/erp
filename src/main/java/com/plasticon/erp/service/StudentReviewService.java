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
	StudentReviewRepository studentReviewRepository;
	
	public List<StudentReview> getStudentReview() {
		return studentReviewRepository.findAll();

	}

	public void saveStudentReview(StudentReview studentReview) {
		studentReviewRepository.save(studentReview);
	}

	@Transactional
	public void removeStudentReview(int id) {
		studentReviewRepository.deleteById(id);
	}

	
	

}
