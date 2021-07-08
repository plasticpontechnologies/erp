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

import com.plasticon.erp.model.EnquiryMessage;
import com.plasticon.erp.model.SmsToRoute;
import com.plasticon.erp.service.RouteService;

@RestController
@RequestMapping("/routesms")
public class RouteController {

	@Autowired
	public RouteService routeService;
	
	@RequestMapping(value = "/getSmsToRoute", method = RequestMethod.GET)
	public List<SmsToRoute>  getSmsToRouteData() {
		return routeService.getSmsToRoute();

	}
	
	  @PostMapping(value = "/saveSmsToRoute", consumes = "application/json")
		public void saveSmsToRoute(@RequestBody SmsToRoute routesms) {
		  routeService.saveSmsToRoute(routesms);

		}
		

		  @DeleteMapping(value ="/removeEnquiryMessage/{id}")
		    public void removeSmsToRoute(@PathVariable("id")int Id){
			  routeService.removeSmsToRoute(Id);
		    }
}
