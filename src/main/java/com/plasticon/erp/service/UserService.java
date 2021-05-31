package com.plasticon.erp.service;

import java.util.List;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.UserDetails;
import com.plasticon.erp.repository.UserRepository;

@Service
public class UserService {
@Autowired
UserRepository userRepository;
	public List<UserDetails> getUserDetails() {
		return userRepository.findAll();

	}

	public void saveUserDetails(UserDetails user) {
		userRepository.save(user);
		

	}
	@Transactional
	public void removeUserDetails(int id) {
		userRepository.deleteById(id);
	}

	

}
