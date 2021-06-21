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
import com.plasticon.erp.model.AddVehicle;
import com.plasticon.erp.service.AddVehicleService;

@RestController
@RequestMapping(value="/addvehicle")
public class AddVehicleController {
@Autowired
AddVehicleService addVehicleService;

@GetMapping(value="/getaddvehicle")
public List<AddVehicle> getAddVehicleDetails(){
	return addVehicleService.getAddVehicleDetails();
}

@PostMapping(value="/saveaddvehicle",consumes="application/json")
public void saveAddVehicleDetails(@RequestBody AddVehicle addVehicle) {
	addVehicleService.saveAddVehicleDetails(addVehicle);
}
@DeleteMapping(value="/deleteaddvehicle/{addVehicleId}")
public void deleteAddVehicleDetailsById(@PathVariable int addVehicleId) {
	addVehicleService.deleteAddVehicleDetailsById(addVehicleId);
}
}
