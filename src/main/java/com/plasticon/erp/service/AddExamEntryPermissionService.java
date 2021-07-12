package com.plasticon.erp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.AddExamEntryPermission;
import com.plasticon.erp.repository.AddExamEntryPermissionRepository;

@Service
public class AddExamEntryPermissionService {
	
	@Autowired
	AddExamEntryPermissionRepository addExamEntryPermissionRepository;
	
	public List<AddExamEntryPermission> getAddExamEntryPermission() {
		return addExamEntryPermissionRepository.findAll();
	}
	
	public void saveAddExamEntryPermission(AddExamEntryPermission permission) {
		addExamEntryPermissionRepository.save(permission);
	}

}
