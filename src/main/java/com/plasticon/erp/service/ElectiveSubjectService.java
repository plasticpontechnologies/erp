package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.ElectiveSubject;
import com.plasticon.erp.model.IssueReport;
import com.plasticon.erp.repository.ElectiveSubjectRepository;


@Service
public class ElectiveSubjectService {

	@Autowired
	ElectiveSubjectRepository electivesubjectRepository;
	
	public List<ElectiveSubject> getElectiveSubject() {
		return electivesubjectRepository.findAll();

	}

	public void saveElectiveSubject(ElectiveSubject report) {
		electivesubjectRepository.save(report);
		

	}
	@Transactional
	public void removeElectiveSubject(int id) {
		electivesubjectRepository.deleteById(id);
	}
}
