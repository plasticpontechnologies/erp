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
import com.plasticon.erp.model.TransportCoordinator;
import com.plasticon.erp.service.TransportCoordinatorService;

@RestController
@RequestMapping(value="/transportcoordinator")
public class TransportCoordinatorController {
@Autowired
TransportCoordinatorService transportCoordinatorService;

@GetMapping(value="/gettransportcoordinator")
public List<TransportCoordinator> getTransportCoordinatorDetails(){
	return transportCoordinatorService.getTransportCoordinatorDetails();
}

@PostMapping(value="/savetransportcoordinator",consumes="application/json")
public void saveTransportCoordinatorDetails(@RequestBody TransportCoordinator transportCoordinator) {
	transportCoordinatorService.saveTransportCoordinatorDetails(transportCoordinator);
}
@DeleteMapping(value="/deletetransportcoordinator/{coordinatorId}")
public void deleteTransportCoordinatorDetailsById(@PathVariable int coordinatorId) {
	transportCoordinatorService.deleteTransportCoordinatorDetailsById(coordinatorId);
}
}
