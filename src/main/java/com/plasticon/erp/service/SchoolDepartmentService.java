package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.SchoolDepartmentDetails;

import com.plasticon.erp.repository.SchoolDepartmentRepository;

@Service
public class SchoolDepartmentService {

	@Autowired
	SchoolDepartmentRepository schoolDepartmentRepository;
	
	public List<SchoolDepartmentDetails> getSchoolDepartmentDetails() {
		return schoolDepartmentRepository.findAll();
	}
	 

	public void saveSchoolDepartmentDetails(SchoolDepartmentDetails schoolDepartment) {
		schoolDepartmentRepository.save(schoolDepartment);
	}

	@Transactional
	public void removeSchoolDepartmentDetails(int id) {
		schoolDepartmentRepository.deleteById(id);
	}
}
