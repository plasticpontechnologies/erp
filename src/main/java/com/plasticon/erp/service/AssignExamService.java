package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.AssignExam;

import com.plasticon.erp.repository.AssinExamRepository;

@Service
public class AssignExamService {
	
	@Autowired
	AssinExamRepository assinExamRepository;
	public List<AssignExam> getAssignExam() {
		return assinExamRepository.findAll();
	}
	
	public void saveAssignExam(AssignExam assignExam) {
		assinExamRepository.save(assignExam);
	
	}
	
	@Transactional
	public void removeAssignExam(int id) {
		assinExamRepository.deleteById(id);
	}
}
