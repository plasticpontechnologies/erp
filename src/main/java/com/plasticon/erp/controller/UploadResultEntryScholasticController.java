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

import com.plasticon.erp.model.SetupExamTermsDetails;
import com.plasticon.erp.model.UploadResultEntryScholasticDetails;
import com.plasticon.erp.service.SetupExamTermsService;
import com.plasticon.erp.service.UploadResultEntryScholasticService;

@RestController
@RequestMapping("/URES")
public class UploadResultEntryScholasticController {

	@Autowired
	UploadResultEntryScholasticService uploadResultEntryScholasticService;
	
	@RequestMapping(value ="/getUploadResultEntryScholasticDetails" , method = RequestMethod.GET)
	public List<UploadResultEntryScholasticDetails>  getUploadResultEntryScholasticData() {
		return uploadResultEntryScholasticService.getUploadResultEntryScholasticDetails();
}
	
	@PostMapping(value = "/saveUploadResultEntryScholasticDetails", consumes = "application/json")
	public void saveUploadResultEntryScholasticDetails(@RequestBody UploadResultEntryScholasticDetails uploadResultEntryScholastic) {
		uploadResultEntryScholasticService.saveUploadResultEntryScholasticDetails(uploadResultEntryScholastic);

	}
	

  @DeleteMapping(value ="/removeUploadResultEntryScholasticDetails/{id}")
    public void removeUploadResultEntryScholasticDetails(@PathVariable("id")int Id){
	  uploadResultEntryScholasticService.removeUploadResultEntryScholasticDetails(Id);
    }
}
