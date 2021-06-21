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

import com.plasticon.erp.model.ViewAdmissionRequest;
import com.plasticon.erp.service.ViewAdmissionRequestService;

@RestController
@RequestMapping("/admission")

public class ViewAdmissionRequestController {

			@Autowired
			ViewAdmissionRequestService viewAdmissionRequestService;

			@RequestMapping(value = "/getViewAdmissionRequest", method = RequestMethod.GET)
			public List<ViewAdmissionRequest>  getViewAdmissionRequestData() {
				return viewAdmissionRequestService.getViewAdmissionRequest();

			}
			
			  @PostMapping(value = "/saveViewAdmissionRequest", consumes = "application/json")
				public void saveViewAdmissionRequest(@RequestBody ViewAdmissionRequest admission) {
					viewAdmissionRequestService.saveViewAdmissionRequest(admission);

				}
				

				  @DeleteMapping(value ="/removeViewAdmissionRequest/{id}")
				    public void removeViewAdmissionRequest(@PathVariable("id")int Id){
					  viewAdmissionRequestService.removeViewAdmissionRequest(Id);
				    }


}
