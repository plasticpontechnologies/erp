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

import com.plasticon.erp.model.EnquiryToFilterwise;
import com.plasticon.erp.model.SendSmsToStaff;
import com.plasticon.erp.repository.FilterWiseRepository;
import com.plasticon.erp.service.FilterWiseService;

@RestController
@RequestMapping("/filterwise")
public class FilterWiseController {

	
	@Autowired
	public FilterWiseService filterwiseService;
	
	@RequestMapping(value = "/getEnquiryToFilterwise", method = RequestMethod.GET)
	public List<EnquiryToFilterwise>  getEnquiryToFilterwiseData() {
		return filterwiseService.getEnquiryToFilterwise();

	}
	
	  @PostMapping(value = "/saveEnquiryToFilterwise", consumes = "application/json")
		public void saveEnquiryToFilterwise(@RequestBody EnquiryToFilterwise filterwise) {
		  filterwiseService.saveEnquiryToFilterwise(filterwise);

		}
		

		  @DeleteMapping(value ="/removeEnquiryToFilterwise/{id}")
		    public void removeEnquiryToFilterwise(@PathVariable("id")int Id){
			  filterwiseService.removeEnquiryToFilterwise(Id);
		    }
}
