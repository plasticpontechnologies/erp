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

import com.plasticon.erp.model.ModifyStaffQualificationDetails;
import com.plasticon.erp.service.ModifyStaffQualificationService;

@RestController
@RequestMapping("/modifystaffQualification")
public class ModifyStaffQualificationController {

	
	@Autowired
	ModifyStaffQualificationService modifyStaffQualificationService;

	@RequestMapping(value = "/getModifyStaffQualificationDetails", method = RequestMethod.GET)
	public List<ModifyStaffQualificationDetails>  getModifyStaffQualificationDetailsData() {
		return modifyStaffQualificationService.getModifyStaffQualificationDetails();

	}
	
	  @PostMapping(value = "/saveModifyStaffQualificationDetails", consumes = "application/json")
		public void saveModifyStaffQualificationDetails(@RequestBody ModifyStaffQualificationDetails modifystaffQualification) {
			modifyStaffQualificationService.saveModifyStaffQualificationDetails(modifystaffQualification);

		}
		

	  @DeleteMapping(value ="/removeModifyStaffQualificationDetails/{id}")
	    public void removeModifyStaffQualificationDetails(@PathVariable("id")int Id){
		  modifyStaffQualificationService.removeModifyStaffQualificationDetails(Id);
	    }
}
