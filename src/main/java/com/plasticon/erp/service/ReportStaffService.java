package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.IssueReportStaff;
import com.plasticon.erp.model.IssueToStaff;
import com.plasticon.erp.repository.ReportStaffRepository;

@Service
public class ReportStaffService {

	@Autowired
	public ReportStaffRepository reportstaffRepository;
	
	public List<IssueReportStaff> getIssueReportStaff() {
		return reportstaffRepository.findAll();

	}

	public void saveIssueReportStaff(IssueReportStaff issuestaff) {
		reportstaffRepository.save(issuestaff);
		
	}
	@Transactional
	public void removeIssueReportStaff(int id) {
		reportstaffRepository.deleteById(id);
	}
}