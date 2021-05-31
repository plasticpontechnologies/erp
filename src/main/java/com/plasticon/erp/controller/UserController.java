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
import com.plasticon.erp.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
		UserService userService;

		@RequestMapping(value = "/getUserDetails", method = RequestMethod.GET)
		public List<UserDetails>  getUserData() {
			return userService.getUserDetails();

		}
		
		  @PostMapping(value = "/saveUserDetails", consumes = "application/json")
			public void saveUserDetails(@RequestBody UserDetails user) {
				userService.saveUserDetails(user);

			}
			

			  @DeleteMapping(value ="/removeuserDetails/{id}")
			    public void removeUserDetails(@PathVariable("id")int Id){
				  userService.removeUserDetails(Id);
			    }

}
