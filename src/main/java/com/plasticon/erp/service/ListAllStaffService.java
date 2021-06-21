package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.ListAllStaffDetails;
import com.plasticon.erp.model.SchoolDepartmentDetails;
import com.plasticon.erp.repository.ListAllStaffRepository;
import com.plasticon.erp.repository.SchoolDepartmentRepository;

@Service
public class ListAllStaffService {
  
	@Autowired
    ListAllStaffRepository listAllStaffRepository;
	
	public List<ListAllStaffDetails> getListAllstaffDetails() {
		return listAllStaffRepository.findAll();
	}
	 

	public void saveListAllStaffDetails(ListAllStaffDetails listAllStaff) {
		listAllStaffRepository.save(listAllStaff);
	}

	@Transactional
	public void removeListAllStaffDetails(int id) {
		listAllStaffRepository.deleteById(id);
	}
}
