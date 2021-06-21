package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.UserType;
import com.plasticon.erp.repository.UserTypeRepository;

@Service
public class UserTypeService {
	@Autowired
	UserTypeRepository userTypeRepository;
		public List<UserType> getUserType() {
			return userTypeRepository.findAll();

		}

		public void saveUserType(UserType type) {
			userTypeRepository.save(type);
			

		}
		@Transactional
		public void removeUserType(int id) {
			userTypeRepository.deleteById(id);
		}
}
