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

import com.plasticon.erp.model.ListAllStaffDetails;
import com.plasticon.erp.service.ListAllStaffService;



@RestController
@RequestMapping("/listallstaff")
public class ListAllStaffController {
	
	@Autowired
	ListAllStaffService listAllStaffService;

	@RequestMapping(value = "/getListAllStaffDetails", method = RequestMethod.GET)
	public List<ListAllStaffDetails>  getListAllStaffData() {
		return listAllStaffService.getListAllstaffDetails();

	}
	
	  @PostMapping(value = "/saveListAllStaffDetails", consumes = "application/json")
		public void saveListAllStaffDetails(@RequestBody ListAllStaffDetails listAllStaff) {
			listAllStaffService.saveListAllStaffDetails(listAllStaff);

		}
		

	  @DeleteMapping(value ="/removeListAllStaffDetails/{id}")
	    public void removeListAllStaffDetails(@PathVariable("id")int Id){
		  listAllStaffService.removeListAllStaffDetails(Id);
	    }

}
