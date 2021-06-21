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

import com.plasticon.erp.model.RouteDetails;
import com.plasticon.erp.service.RouteDetailsService;


@RestController
@RequestMapping("/Transport")
public class RouteDetailsController {
	
		@Autowired
		RouteDetailsService routeDetailsService;

		@RequestMapping(value = "/getRouteDetails", method = RequestMethod.GET)
		public List<RouteDetails>  getRouteDetailsData() {
			return routeDetailsService.getRouteDetails();

		}
		
		  @PostMapping(value = "/saveRouteDetails", consumes = "application/json")
			public void saveRouteDetails(@RequestBody RouteDetails Transport) {
				routeDetailsService.saveRouteDetails(Transport);

			}
			

			  @DeleteMapping(value ="/removeRouteDetails/{id}")
			    public void removeRouteDetails(@PathVariable("id")int Id){
				  routeDetailsService.removeRouteDetails(Id);
			    }


}
