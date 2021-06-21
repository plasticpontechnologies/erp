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
import com.plasticon.erp.model.StaffSalaryDetails;
import com.plasticon.erp.service.StaffReviewService;
import com.plasticon.erp.service.StaffSalaryService;

@RestController
@RequestMapping("/staffSalary")
public class StaffSalarycontroller {
	@Autowired
	 StaffSalaryService staffSalaryService;
		
		@RequestMapping(value ="getStaffSalaryDetails" , method = RequestMethod.GET)
		public List<StaffSalaryDetails>  getStaffSalaryData() {
			return staffSalaryService.getStaffSalaryDetails();
	}
		
		@PostMapping(value = "/saveStaffSalaryDetails", consumes = "application/json")
		public void saveStaffSalarytDetails(@RequestBody StaffSalaryDetails staffSalary) {
			staffSalaryService.saveStaffSalaryDetails(staffSalary);

		}
		

	  @DeleteMapping(value ="/removeStaffSalaryDetails/{id}")
	    public void removeStaffSalaryDetails(@PathVariable("id")int Id){
		  staffSalaryService.removeStaffSalaryDetails(Id);
	    }

}
