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

import com.plasticon.erp.model.StaffWorkingHour;
import com.plasticon.erp.model.StartAdmission;
import com.plasticon.erp.service.StaffWorkingHourService;
import com.plasticon.erp.service.StartAdmissionService;

@RestController
@RequestMapping("/admission")
public class StartAdmissionController {
	@Autowired
	StartAdmissionService startAdmissionService;

	@RequestMapping(value = "/getStartAdmission", method = RequestMethod.GET)
	public List<StartAdmission>  getStartAdmissionData() {
		return startAdmissionService.getStartAdmission();

	}
	
	  @PostMapping(value = "/saveStartAdmission", consumes = "application/json")
		public void saveStartAdmission(@RequestBody StartAdmission admission) {
		  startAdmissionService.saveStartAdmission(admission);

		}
		

	  @DeleteMapping(value ="/removeStartAdmission/{id}")
	    public void removeStartAdmission(@PathVariable("id")int Id){
		  startAdmissionService.removeStartAdmission(Id);
	    }

	

}