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

import com.plasticon.erp.model.CallType;
import com.plasticon.erp.service.CallTypeService;


@RestController
@RequestMapping("/FrontOfficeMasterEntry")
public class CallTypeController {
	@Autowired
	CallTypeService callTypeService;

	@RequestMapping(value = "/getCallType", method = RequestMethod.GET)
	public List<CallType>  getCallTypeData() {
		return callTypeService.getCallType();

	}
	
	  @PostMapping(value = "/saveCallType", consumes = "application/json")
		public void saveCallType(@RequestBody CallType MasterEntry) {
			callTypeService.saveCallType(MasterEntry);

		}
		

		  @DeleteMapping(value ="/removeCallType/{id}")
		    public void removeCallType(@PathVariable("id")int Id){
			  callTypeService.removeCallType(Id);
		    }

}
