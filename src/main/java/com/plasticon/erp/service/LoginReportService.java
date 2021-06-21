package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.plasticon.erp.model.LoginReport;

import com.plasticon.erp.repository.LoginReportRepository;

@Service
public class LoginReportService {
	@Autowired
    LoginReportRepository loginReportRepository;
	
	public List<LoginReport> getLoginReport() {
		return loginReportRepository.findAll();
	}
	 

	public void saveLoginReport(LoginReport manageuser) {
		loginReportRepository.save(manageuser);
	}

	@Transactional
	public void removeLoginReport(int id) {
		loginReportRepository.deleteById(id);
	}

}
