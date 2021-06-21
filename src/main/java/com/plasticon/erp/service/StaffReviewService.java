package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.plasticon.erp.model.StaffReviewDetails;

import com.plasticon.erp.repository.StaffReviewRepository;
@Service
public class StaffReviewService {
 
	@Autowired
    StaffReviewRepository staffReviewRepository;
	
	public List<StaffReviewDetails> getStaffReviewDetails() {
		return staffReviewRepository.findAll();
	}
	 

	public void saveStaffReviewDetails(StaffReviewDetails staffReview) {
		staffReviewRepository.save(staffReview);
	}

	@Transactional
	public void removeStaffReviewDetails(int id) {
	      staffReviewRepository.deleteById(id);
	}
}
