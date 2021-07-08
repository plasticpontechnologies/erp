package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.IssueToStaff;
import com.plasticon.erp.model.StaffLoginDetails;
import com.plasticon.erp.repository.IssueToStaffRepository;


@Service
public class IssueToStaffService {

	@Autowired
	public IssueToStaffRepository issuetostaffRepository;
	
	public List<IssueToStaff> getIssueToStaff() {
		return issuetostaffRepository.findAll();

	}

	public void saveIssueToStaff(IssueToStaff issuestaff) {
		issuetostaffRepository.save(issuestaff);
		
	}
	@Transactional
	public void removeIssueToStaff(int id) {
		issuetostaffRepository.deleteById(id);
	}
}
