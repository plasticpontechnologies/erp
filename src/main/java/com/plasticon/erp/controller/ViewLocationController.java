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

import com.plasticon.erp.model.ViewLocation;
import com.plasticon.erp.service.ViewLocationService;



@RestController
@RequestMapping("/Transport")
public class ViewLocationController {
	@Autowired
	ViewLocationService viewLocationService;

	@RequestMapping(value = "/getViewLocation", method = RequestMethod.GET)
	public List<ViewLocation>  getViewLocationData() {
		return viewLocationService.getViewLocation();

	}
	
	  @PostMapping(value = "/saveViewLocation", consumes = "application/json")
		public void saveViewLocation(@RequestBody ViewLocation Transport) {
			viewLocationService.saveViewLocation(Transport);

		}
		

		  @DeleteMapping(value ="/removeViewLocation/{id}")
		    public void removeViewAllocation(@PathVariable("id")int Id){
			  viewLocationService.removeViewLocation(Id);
		    }

}
