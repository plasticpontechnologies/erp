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

import com.plasticon.erp.model.AdmissionProcessMasterEntry;

import com.plasticon.erp.service.AdmissionProcessMasterEntryService;


@RestController
@RequestMapping("/admission")
public class AdmissionProcessMasterEntryController {
	@Autowired
	AdmissionProcessMasterEntryService admissionProcessMasterEntryService;

	@RequestMapping(value = "/getAdmissionProcessMasterEntry", method = RequestMethod.GET)
	public List<AdmissionProcessMasterEntry>  getAdmissionProcessMasterEntryData() {
		return admissionProcessMasterEntryService.getAdmissionProcessMasterEntry();

	}
	
	  @PostMapping(value = "/saveAdmissionProcessMasterEntry", consumes = "application/json")
		public void saveAdmissionProcessMasterEntry(@RequestBody AdmissionProcessMasterEntry admission) {
		  admissionProcessMasterEntryService.saveAdmissionProcessMasterEntry(admission);

		}
		

	  @DeleteMapping(value ="/removeAdmissionProcessMasterEntry/{id}")
	    public void removeAdmissionProcessMasterEntry(@PathVariable("id")int Id){
		  admissionProcessMasterEntryService.removeAdmissionProcessMasterEntry(Id);
	    }

}
