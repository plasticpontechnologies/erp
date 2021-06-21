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
import com.plasticon.erp.model.RouteTo;
import com.plasticon.erp.service.RouteToService;

@RestController
@RequestMapping(value="/routeTo")
public class RouteToController {
@Autowired
RouteToService routeToService;

@GetMapping(value="/getrouteTo")
public List<RouteTo> getRouteToDetails(){
	return routeToService.getRouteToDetails();
	}

@PostMapping(value="/saverouteTo",consumes="application/json")
public void saveRouteToDetails(@RequestBody RouteTo routeTo) {
	routeToService.saveRouteToDetails(routeTo);
}
@DeleteMapping(value="/deleterouteTo/{routeId}")
public void deleteRouteToDetailsById(@PathVariable int routeId) {
	routeToService.deleteRouteToDetailsById(routeId);
}
}
