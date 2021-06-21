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

import com.plasticon.erp.model.StaffReviewDetails;
import com.plasticon.erp.service.StaffReviewService;

@RestController
@RequestMapping("/staffReview")
public class StaffReviewContoller {
 
	@Autowired
    StaffReviewService staffReviewService;
	
	@RequestMapping(value ="getStaffReviewDetails" , method = RequestMethod.GET)
	public List<StaffReviewDetails>  getStaffReviewData() {
		return staffReviewService.getStaffReviewDetails();
}
	
	@PostMapping(value = "/saveStaffReviewDetails", consumes = "application/json")
	public void saveStaffReviewDetails(@RequestBody StaffReviewDetails staffReview) {
		staffReviewService.saveStaffReviewDetails(staffReview);

	}
	

  @DeleteMapping(value ="/removeStaffReviewDetails/{id}")
    public void removeStaffReviewDetails(@PathVariable("id")int Id){
	  staffReviewService.removeStaffReviewDetails(Id);
    }
}
