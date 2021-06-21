package com.plasticon.erp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.plasticon.erp.model.StaffRoute;
import com.plasticon.erp.service.StaffRouteService;

@RestController
@RequestMapping(value="/staffroute")
public class StaffRouteController {
@Autowired
StaffRouteService staffRouteService;


	@GetMapping(value="/getstaffroute")
	public List<StaffRoute> getStaffRouteDetails(){
		return staffRouteService.getStaffRouteDetails();
	}
	
	
	@PostMapping(value="/savestaffroute",consumes="application/json")
	public void saveStaffRouteDetails(@RequestBody StaffRoute staffRoute) {
		staffRouteService.saveStaffRouteDetails(staffRoute);
	}
	
	
	@DeleteMapping(value="/deletestaffroute/{staffRouteId}")
	public void deleteStaffRouteDetails(@PathVariable int staffRouteId) {
		staffRouteService.deleteStaffRouteDetailsById(staffRouteId);
	}
}
