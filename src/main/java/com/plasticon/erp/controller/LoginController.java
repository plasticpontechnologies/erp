package com.plasticon.erp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.plasticon.erp.model.UserDetails;
import com.plasticon.erp.service.LoginService;

@RestController
@RequestMapping("/login")
public class LoginController {
	
		@Autowired
		LoginService loginService;
		
		@RequestMapping(value = "/login/{userName}/{userPassword}", method = RequestMethod.GET)
		public List<UserDetails> findByUserNameAndUserPassword(@PathVariable String userName,@PathVariable String userPassword){
		    System.out.println(userName+" "+userPassword);
			return loginService.findByUserNameAndUserPassword(userName, userPassword);
		}

}
