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

import com.plasticon.erp.model.AddStop;
import com.plasticon.erp.service.AddStopService;

@RestController
@RequestMapping(value="/addstop")
public class AddStopController {
@Autowired
AddStopService addStopService;

@GetMapping(value="/getaddstop")
public List<AddStop> getAddStopDetails(){
	return addStopService.getAddStopDetails();
}

@PostMapping(value="/saveaddstop",consumes="application/json")
public void saveAddStopDetails(@RequestBody AddStop addStop) {
	addStopService.saveAddStopDetails(addStop);
}
@DeleteMapping(value="/deleteaddstop/{stopId}")
public void deleteAddStopDetailsById(@PathVariable int stopId) {
	addStopService.deleteAddStopDetailsById(stopId);
}
}
