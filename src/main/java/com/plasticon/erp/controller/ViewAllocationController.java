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

import com.plasticon.erp.model.ViewAllocation;
import com.plasticon.erp.service.ViewAllocationService;


@RestController
@RequestMapping("/timetable")
public class ViewAllocationController {
	
		@Autowired
		ViewAllocationService viewAllocationService;

		@RequestMapping(value = "/getViewAllocation", method = RequestMethod.GET)
		public List<ViewAllocation>  getViewAllocationData() {
			return viewAllocationService.getViewAllocation();

		}
		
		  @PostMapping(value = "/saveViewAllocation", consumes = "application/json")
			public void saveViewAllocation(@RequestBody ViewAllocation timetable) {
				viewAllocationService.saveViewAllocation(timetable);

			}
			

			  @DeleteMapping(value ="/removeViewAllocation/{id}")
			    public void removeViewAllocation(@PathVariable("id")int Id){
				  viewAllocationService.removeViewAllocation(Id);
			    }

}
