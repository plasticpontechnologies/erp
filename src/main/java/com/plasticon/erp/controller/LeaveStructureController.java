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
import com.plasticon.erp.model.LeaveStructure;
import com.plasticon.erp.service.LeaveStructureService;

@RestController
@RequestMapping(value="/leavestructure")
public class LeaveStructureController {
@Autowired
LeaveStructureService leaveStructureService;


@GetMapping(value="/getleavestructuredetails")
public List<LeaveStructure> getLeaveStructureDetails(){
	return leaveStructureService.getLeaveStructureDetails();
}


@PostMapping(value="/saveleavestructuredetails",consumes="application/json")
public void saveLeaveStructureDetails(@RequestBody LeaveStructure leaveStructure) {
	leaveStructureService.saveLeaveStructureDetails(leaveStructure);
}


@DeleteMapping(value="/deleteleavestructure/{leaveStructureId}")
public void deleteLeaveStructureDetails(@PathVariable int leaveStructureId) {
	leaveStructureService.deleteLeaveStructureDetails(leaveStructureId);
}

}
