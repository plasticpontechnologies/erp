package com.plasticon.erp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.plasticon.erp.model.EvaluateExamResult;
import com.plasticon.erp.service.EvaluateExamResultService;

@RestController
@RequestMapping("/examresult")
public class EvaluateExamResultController {
	
	@Autowired
	EvaluateExamResultService evaluateExamResultService;
	
	@RequestMapping(value="/getexamresult", method=RequestMethod.GET)
	public List<EvaluateExamResult> getEvaluateExamResult() {
		return evaluateExamResultService.getEvaluateExamResult();
	}
	
	@PostMapping(value="/saveexamresult", consumes="application/json")
	public void saveEvaluateExamResult(@RequestBody EvaluateExamResult examresult) {
		evaluateExamResultService.saveEvaluateExamResult(examresult);
	}

}
