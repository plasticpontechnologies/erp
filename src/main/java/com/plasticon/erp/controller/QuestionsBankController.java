package com.plasticon.erp.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.plasticon.erp.model.QuestionsBank;
import com.plasticon.erp.service.QuestionsBankService;





@RestController
@RequestMapping("/questions")
public class QuestionsBankController {
	
	@Autowired
	QuestionsBankService questionsBankService;
	
	
	@RequestMapping(value = "/getquestions", method= RequestMethod.GET)
	public List<QuestionsBank> getQuestionsBank() {
		return questionsBankService.getQuestionsBank();
		
	}
	
	@PostMapping(value = "/saveQuestionBankService", consumes = "application/json")
	public void saveQuestionBankService(@RequestBody QuestionsBank questions) {
		questionsBankService.saveQuestionsBank(questions);
	}
	
	@DeleteMapping(value = "/removevquestionBank/{id}")
	public void removeQuestionBank(@PathVariable("id")int Id) {
		questionsBankService.removeQuestionsBank(Id);
	}
	
	  @GetMapping(value="/getsubjectsbyid/{suId}") 
	  public List<QuestionsBank> getQuestionsBySub(@PathVariable("suId")int suId) {
		  
	 return questionsBankService.findBySubId(suId);
	  
	  }
	 

}
