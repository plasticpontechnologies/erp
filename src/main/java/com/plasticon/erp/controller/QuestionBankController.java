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

import com.plasticon.erp.model.QuestionBank;
import com.plasticon.erp.service.QuestionBankService;

@RestController
@RequestMapping("/questionbank")
public class QuestionBankController {
	
	@Autowired
	QuestionBankService questionBankService;
	
	@RequestMapping(value = "/getquestions", method= RequestMethod.GET)
	public List<QuestionBank> getQuestionBank() {
		return questionBankService.getQuestionBank();
		
	}
	
	@PostMapping(value = "/saveQuestionBankService", consumes = "json/application")
	public void saveQuestionBankService(@RequestBody QuestionBank questions) {
		questionBankService.saveQuestionBank(questions);
	}
	
	@DeleteMapping(value = "/removevquestionBank/{id}")
	public void removeQuestionBank(@PathVariable("id")int Id) {
		questionBankService.removeQuestionBank(Id);
	}

}
