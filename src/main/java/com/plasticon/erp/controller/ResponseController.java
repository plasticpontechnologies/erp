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

import com.plasticon.erp.model.Response;
import com.plasticon.erp.service.ResponseService;


@RestController
@RequestMapping("/FrontOfficeMasterEntry")
public class ResponseController {
	@Autowired
	ResponseService responseService;

	@RequestMapping(value = "/getResponse", method = RequestMethod.GET)
	public List<Response>  getResponseData() {
		return responseService.getResponse();

	}
	
	  @PostMapping(value = "/saveResponse", consumes = "application/json")
		public void saveResponse(@RequestBody Response MasterEntry) {
			responseService.saveResponse(MasterEntry);

		}
		

		  @DeleteMapping(value ="/removeResponse/{id}")
		    public void removeResponse(@PathVariable("id")int Id){
			  responseService.removeResponse(Id);
		    }

}
