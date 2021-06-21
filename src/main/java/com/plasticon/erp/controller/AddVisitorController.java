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
import com.plasticon.erp.model.AddVisitor;
import com.plasticon.erp.service.AddVisitorService;

@RestController
@RequestMapping(value="/addvisitor")
public class AddVisitorController {
@Autowired
AddVisitorService addVisitorService;


@GetMapping(value="/getaddvisitor")
public List<AddVisitor> getAddVisitorDetails(){
	return addVisitorService.getAddComplaintDetails();
}

@PostMapping(value="/saveaddvisitor",consumes="application/json")
public void saveAddVisitorDetails(@RequestBody AddVisitor addVisitor) {
	addVisitorService.saveAddVisitorDetails(addVisitor);
}
@DeleteMapping(value="/deleteaddvisitor/{addVisitorId}")
public void deleteAddVisitorDetailsById(@PathVariable int addVisitorId) {
	addVisitorService.deleteAddVisitorDetailsById(addVisitorId);
}
}
