package com.plasticon.erp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.UserDetails;
import com.plasticon.erp.repository.UserRepository;

@Service
public class LoginService {
	@Autowired
	UserRepository userRepository;

	public List<UserDetails> findByUserNameAndUserPassword(String userName, String userPassword) {
		return ServiceStubbing.UserDetails(userName, userPassword);
		// ServiceStubbing.UserDetails(userName, userPassword);
	}

}
