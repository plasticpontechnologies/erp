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

import com.plasticon.erp.model.DefineLeaveType;
import com.plasticon.erp.service.DefineLeaveTypeService;

@RestController
@RequestMapping(value="/defineleavetype")
public class DefineLeaveTypecontroller {
@Autowired
DefineLeaveTypeService defineLeaveTypeService;
@GetMapping(value="/getdefineleavetype")
public List<DefineLeaveType> getDefineLeaveType(){
	return defineLeaveTypeService.getDefineLeaveTyepDetails();
}
@PostMapping(value="/savedefineleavetype",consumes="application/json")
public void saveDefineLeaveType(@RequestBody DefineLeaveType defineLeaveType) {
	defineLeaveTypeService.saveDefineLeaveTypeDetails(defineLeaveType);
}
@DeleteMapping(value="/deletedefineleavetype/{defineLeaveTypeId}")
public void deleteDefineLeaveType(@PathVariable int defineLeaveTypeId) {
	defineLeaveTypeService.deleteDefineLeaveTypeById(defineLeaveTypeId);
}
}
