package com.plasticon.erp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.plasticon.erp.model.EvaluationExam;
import com.plasticon.erp.service.EvaluationExamService;

@RestController
@RequestMapping("/evaluate")
public class EvaluationExamController {
	
	@Autowired
	EvaluationExamService evaluationExamService;
	
	@RequestMapping(value = "/evaluateexam", method=RequestMethod.GET)
	public List<EvaluationExam> getEvaluationExam() {
		return evaluationExamService.getEvaluationExam();
	}
	
	@PostMapping(value = "/saveevaluateexam", consumes = "application/json")
	public void saveEvaluationExam(@RequestBody EvaluationExam evaluateexam) {
		evaluationExamService.saveEvaluationExam(evaluateexam);
	}
	
	@DeleteMapping(value = "/removeevaluationExam/{id}")
	public void removeEvaluateExam(@PathVariable("id")int Id) {
		evaluationExamService.removeEvaluationExam(Id);
	}

}
