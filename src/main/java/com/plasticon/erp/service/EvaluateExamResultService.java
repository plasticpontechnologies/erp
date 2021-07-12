package com.plasticon.erp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.EvaluateExamResult;
import com.plasticon.erp.repository.EvaluateExamResultRespository;

@Service
public class EvaluateExamResultService {
	
	@Autowired
	EvaluateExamResultRespository evaluateExamResultRespository;
	
	public List<EvaluateExamResult> getEvaluateExamResult() {
		return evaluateExamResultRespository.findAll();
	}
	
	public void saveEvaluateExamResult(EvaluateExamResult evaluateExamResult) {
		evaluateExamResultRespository.save(evaluateExamResult);
	}


}
