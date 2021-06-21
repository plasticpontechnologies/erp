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

import com.plasticon.erp.model.SchoolDepartmentDetails;
import com.plasticon.erp.model.StaffDetails;
import com.plasticon.erp.service.SchoolDepartmentService;
import com.plasticon.erp.service.StaffService;

@RestController
@RequestMapping("/schoolDept")
public class SchoolDepartmentController {

	@Autowired
	SchoolDepartmentService schoolDepartmentService;

	@RequestMapping(value = "/getSchoolDepartmentDetails", method = RequestMethod.GET)
	public List<SchoolDepartmentDetails>  getSchoolDepartmentData() {
		return schoolDepartmentService.getSchoolDepartmentDetails();

	}
	
	  @PostMapping(value = "/saveSchoolDepartmentDetails", consumes = "application/json")
		public void saveStaffDetails(@RequestBody SchoolDepartmentDetails schoolDepartment) {
			schoolDepartmentService.saveSchoolDepartmentDetails(schoolDepartment);

		}
		

	  @DeleteMapping(value ="/removeSchoolDepartmentDetails/{id}")
	    public void removeSchoolDepartmentDetails(@PathVariable("id")int Id){
		  schoolDepartmentService.removeSchoolDepartmentDetails(Id);
	    }
	  
}
