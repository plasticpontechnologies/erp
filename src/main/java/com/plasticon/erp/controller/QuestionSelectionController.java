package com.plasticon.erp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.plasticon.erp.model.QuestionSelection;
import com.plasticon.erp.service.QuestionSelectionService;

@RestController
@RequestMapping("/selection")
public class QuestionSelectionController {
	
	@Autowired
	QuestionSelectionService questionSelectionService;
	
	@RequestMapping(value = "/getquestionselection", method = RequestMethod.GET)
	public List<QuestionSelection> getQuestionSelections() {
		return questionSelectionService.getQuestionSelection();
	}
	
    @PostMapping(value = "/savequestionselection", consumes = "application/json")
	public void saveQuestionSelection(QuestionSelection questionSelection) {
		questionSelectionService.saveQuestionSelection(questionSelection);
	}
    
    @DeleteMapping(value ="/removequestionselection/{id}")
    public void removeQuestionSelection(int id) {
    	questionSelectionService.removeQuestionSelection(id);
    }
	

}
