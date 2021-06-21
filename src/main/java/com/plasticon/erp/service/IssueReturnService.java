package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.BarCode;
import com.plasticon.erp.model.IssueReturn;
import com.plasticon.erp.repository.IssueReturnRepository;

@Service
public class IssueReturnService {

	@Autowired
	IssueReturnRepository issuereturnRepository;
	
	public List<IssueReturn> getIssueReturn() {
		return issuereturnRepository.findAll();

	}

	public void saveIssueReturn(IssueReturn issue) {
		issuereturnRepository.save(issue);
		

	}
	@Transactional
	public void removeIssueReturn(int id) {
		issuereturnRepository.deleteById(id);
	}
}
