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

import com.plasticon.erp.model.UserDetails;
import com.plasticon.erp.model.UserType;
import com.plasticon.erp.service.UserTypeService;

@RestController
@RequestMapping("/type")
public class UserTypeController {
	@Autowired
	UserTypeService userTypeService;

	@RequestMapping(value = "/getUserType", method = RequestMethod.GET)
	public List<UserType>  getUserTypeData() {
		return userTypeService.getUserType();

	}
	
	  @PostMapping(value = "/saveUserType", consumes = "application/json")
		public void saveUserType(@RequestBody UserType type) {
			userTypeService.saveUserType(type);

		}
		

		  @DeleteMapping(value ="/removeUserType/{id}")
		    public void removeUserType(@PathVariable("id")int Id){
			  userTypeService.removeUserType(Id);
		    }

}
