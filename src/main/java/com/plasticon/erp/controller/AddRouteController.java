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

import com.plasticon.erp.model.AddRoute;
import com.plasticon.erp.service.AddRouteService;

@RestController
@RequestMapping(value="/addroute")
public class AddRouteController {
@Autowired
AddRouteService addRouteService;

@GetMapping(value="/getaddroute")
public List<AddRoute> getAddRouteDetails(){
	return addRouteService.getAddRouteDetails();
}

@PostMapping(value="/saveaddroute",consumes="application/json")
public void saveAddRouteDetails(@RequestBody AddRoute addRoute) {
	addRouteService.saveAddRouteDetails(addRoute);
}
@DeleteMapping(value="/deleteaddroute/{routeId}")
public void deleteAddRouteDetailsById(@PathVariable int routeId) {
	addRouteService.deleteAddRouteDetailsById(routeId);
}
}
