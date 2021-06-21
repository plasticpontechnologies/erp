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

import com.plasticon.erp.model.UserPermissionUserType;
import com.plasticon.erp.service.UserPermissionUserTypeService;

@RestController
@RequestMapping("/userpermission")
public class UserPermissionUserTypeController {
	
	@Autowired
	UserPermissionUserTypeService userPermissionUserTypeService;
	
	@RequestMapping(value = "/getmanageusertypeandpermission", method = RequestMethod.GET)
	public List<UserPermissionUserType> getUserPermissionUserType() {
		return userPermissionUserTypeService.getUserPermissionUserType();
	}
	
	@PostMapping(value = "/savemanageusertypeandpermission", consumes = "application/json")
	public void saveUserPermissionUserType(@RequestBody UserPermissionUserType user) {
		userPermissionUserTypeService.saveUserPermissionUserType(user);
	}
	
	@DeleteMapping(value ="/removemanageusertypeandpermission/{id}")
	public void removeUserPermissionUserType(@PathVariable("id")int Id){
		userPermissionUserTypeService.removeUserPermissionUserType(Id);
	}
}
