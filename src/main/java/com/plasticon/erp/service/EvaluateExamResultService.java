package com.plasticon.erp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.EvaluateExamResult;
import com.plasticon.erp.repository.EvaluateExamResultRespository;
<<<<<<< HEAD

=======
>>>>>>> 4c8acaba45c2dc1c71733bbb34694d88a57c3e81
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
<<<<<<< HEAD
	
=======
>>>>>>> 4c8acaba45c2dc1c71733bbb34694d88a57c3e81

}
