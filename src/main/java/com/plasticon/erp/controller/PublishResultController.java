package com.plasticon.erp.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.plasticon.erp.model.PublishResultDetails;
import com.plasticon.erp.service.PublishResultService;

@RestController
@RequestMapping("/prc")
public class PublishResultController {
	
	@Autowired
	PublishResultService publishResultService;

	@RequestMapping(value = "/getPublishResultDetails", method = RequestMethod.GET)
	public List<PublishResultDetails>  getPublishResultData() {
		return publishResultService.getPublishResultDetails();

	}
	
	  @PostMapping(value = "/savePublishResultDetails", consumes = "application/json")
		public void savePublishResultDetails(@RequestBody PublishResultDetails p) {
			publishResultService.savePublishResultDetails(p);

		}
		

	  @DeleteMapping(value ="/removePublishResultDetails/{id}")
	    public void removePublishResultDetails(@PathVariable("id")int Id){
		  publishResultService.removePublishResultDetails(Id);
	    }
 
}
