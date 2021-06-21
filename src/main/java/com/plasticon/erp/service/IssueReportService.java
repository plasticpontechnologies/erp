package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.IssueReport;
import com.plasticon.erp.model.IssueReturn;
import com.plasticon.erp.repository.IssueReportRepository;

@Service
public class IssueReportService {

	@Autowired
	IssueReportRepository issuereturnRepository;
	
	public List<IssueReport> getIssueReport() {
		return issuereturnRepository.findAll();

	}

	public void saveIssueReport(IssueReport report) {
		issuereturnRepository.save(report);
		

	}
	@Transactional
	public void removeIssueReport(int id) {
		issuereturnRepository.deleteById(id);
	}
}
