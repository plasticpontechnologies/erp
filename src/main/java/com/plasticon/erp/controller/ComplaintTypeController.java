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

import com.plasticon.erp.model.ClassDetails;
import com.plasticon.erp.model.ComplaintType;
import com.plasticon.erp.service.ClassService;
import com.plasticon.erp.service.ComplaintTypeService;
@RestController
@RequestMapping("/FrontOfficeMasterEntry")
public class ComplaintTypeController {
	
		@Autowired
		ComplaintTypeService complaintTypeService;

		@RequestMapping(value = "/getComplaintType", method = RequestMethod.GET)
		public List<ComplaintType>  getComplaintTypeData() {
			return complaintTypeService.getComplaintType();

		}
		
		  @PostMapping(value = "/saveComplaintType", consumes = "application/json")
			public void saveComplaintType(@RequestBody ComplaintType MasterEntry) {
				complaintTypeService.saveComplaintType(MasterEntry);

			}
			

			  @DeleteMapping(value ="/removeComplaintType/{id}")
			    public void removeComplaintType(@PathVariable("id")int Id){
				  complaintTypeService.removeComplaintType(Id);
			    }

}
