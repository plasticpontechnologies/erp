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

import com.plasticon.erp.model.DefineLeaveCoordinator;
import com.plasticon.erp.service.DefineLeaveCoordinatorService;

@RestController
@RequestMapping(value="/defineleavecoordinator")
public class DefineLeaveCoordinatorController {
@Autowired
DefineLeaveCoordinatorService defineLeaveCoordinatorService;
@GetMapping(value="/getdefineleavecoordinator")
public List<DefineLeaveCoordinator> getDefineLeaveCoordinatorDetails(){
	return defineLeaveCoordinatorService.getDefineLeaveCoordinatorDetails();
}
@PostMapping(value="/savedefineleavecoordinator",consumes="application/json")
public void saveDefineLeaveCoordinator(@RequestBody DefineLeaveCoordinator defineLeaveCoordinator) {
	defineLeaveCoordinatorService.saveDefineLeaveCoordinatorDetails(defineLeaveCoordinator);
}
@DeleteMapping(value="/deletedefineleavecoordinator/{defineLeaveTypeCoordinatorId}")
public void deleteDefineLeaveCoordinator(@PathVariable int defineLeaveCoordinatorId) {
	defineLeaveCoordinatorService.deleteDefineLeaveCoordinatorDetails(defineLeaveCoordinatorId);
}

}
