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

import com.plasticon.erp.model.ModifyStaffInAndOutDetails;
import com.plasticon.erp.service.ModifyStaffInAndOutService;

@RestController
@RequestMapping("/MSIAO")
public class ModifyStaffInAndOutController {

	
	@Autowired
	ModifyStaffInAndOutService modifyStaffInAndOutService;

	@RequestMapping(value = "/getModifyStaffInAndOutDetails", method = RequestMethod.GET)
	public List<ModifyStaffInAndOutDetails>  getModifyStaffInAndOutData() {
		return modifyStaffInAndOutService.getModifyStaffInAndOutDetails();

	}
	
	  @PostMapping(value = "/saveModifyStaffInAndOutDetails", consumes = "application/json")
		public void saveModifyStaffinAndOutDetails(@RequestBody ModifyStaffInAndOutDetails modifystaffinandout) {
			modifyStaffInAndOutService.saveModifyStaffInAndOutDetails(modifystaffinandout);

		}
		

	  @DeleteMapping(value ="/removeModifyStaffInAndOutDetails/{id}")
	    public void removeModifyStaffInAndOutDetails(@PathVariable("id")int Id){
		  modifyStaffInAndOutService.removeModifyStaffInAndOutDetails(Id);
	    }

}
