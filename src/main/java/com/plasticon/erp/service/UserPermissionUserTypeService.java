package com.plasticon.erp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.UserPermissionUserType;
import com.plasticon.erp.repository.UserPermissionUserTypeRepository;

@Service
public class UserPermissionUserTypeService {
	
	@Autowired
	UserPermissionUserTypeRepository userPermissionUserTypeRepository;
	
	public List<UserPermissionUserType> getUserPermissionUserType() {
		return userPermissionUserTypeRepository.findAll();
	}
	
	public void saveUserPermissionUserType(UserPermissionUserType userpermission) {
		userPermissionUserTypeRepository.save(userpermission);
	}
	
	public void removeUserPermissionUserType(int id) {
		userPermissionUserTypeRepository.deleteById(id);
	}

}
