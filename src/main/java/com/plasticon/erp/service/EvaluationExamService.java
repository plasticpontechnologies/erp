package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.EvaluationExam;
import com.plasticon.erp.repository.EvaluationExamRepository;

@Service
public class EvaluationExamService {
	
	@Autowired
	EvaluationExamRepository evaluationExamRepository;
	public List<EvaluationExam> getEvaluationExam() {
		return evaluationExamRepository.findAll();
	}
	
	public void saveEvaluationExam(EvaluationExam evaluationexam) {
		evaluationExamRepository.save(evaluationexam);
	}
	
	@Transactional
	public void removeEvaluationExam(int id) {
		evaluationExamRepository.deleteById(id);
	}

}
