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

import com.plasticon.erp.model.PositionDetails;
import com.plasticon.erp.model.RouteMessage;
import com.plasticon.erp.service.RouteMessageService;

@RestController
@RequestMapping("/routemess")
public class RouteMessageController {

	
	@Autowired
	RouteMessageService routemessageService;
	
	@RequestMapping(value = "/getRouteMessageDetails", method = RequestMethod.GET)
	public List<RouteMessage>  getRouteMessageData() {
		return routemessageService.getRouteMessage();

	}
	
	  @PostMapping(value = "/saveRouteMessageDetails", consumes = "application/json")
		public void saveRouteMessage(@RequestBody RouteMessage routemess) {
		  routemessageService.saveRouteMessage(routemess);

		}
		
	  @DeleteMapping(value ="/removeRouteMessageDetails/{id}")
	    public void removeRouteMessage(@PathVariable("id")int Id){
		  routemessageService.removeRouteMessage(Id);
	    }
}

