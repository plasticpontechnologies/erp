package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.HomeWork;
import com.plasticon.erp.model.HomeworkEvaluationReport;
import com.plasticon.erp.repository.HomeWorkRepository;
import com.plasticon.erp.repository.HomeworkEvaluationReportRepository;

@Service
public class HomeWorkService {

	@Autowired
	HomeWorkRepository homeWorkRepository;
	
	
	public List<HomeWork> getHomeWork() {
		return homeWorkRepository.findAll();
	}
	 

	public void saveHomeWork(HomeWork homework) {
		homeWorkRepository.save(homework);
	}

	@Transactional
	public void removeHomeWork(int id) {
		homeWorkRepository.deleteById(id);
	}
}
