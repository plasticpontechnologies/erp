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

import com.plasticon.erp.model.PositionDetails;
import com.plasticon.erp.model.Questions;
import com.plasticon.erp.service.QuestionsService;

@RestController
@RequestMapping("/questions")
public class QuestionsController {

	@Autowired
	QuestionsService questionsService;
	
	
	@RequestMapping(value = "/getQuestionsDetails", method = RequestMethod.GET)
	public List<Questions>  getQuestionsData() {
		return questionsService.getQuestionsDetails();

	}
	
	  @PostMapping(value = "/saveQuestionsDetails", consumes = "application/json")
		public void saveQuestionsDetails(@RequestBody Questions questions) {
		  questionsService.saveQuestionsDetails(questions);

		}
		

	  @DeleteMapping(value ="/removeQuestionsDetails/{id}")
	    public void removeQuestionsDetails(@PathVariable("id")int Id){
		  questionsService.removeQuestionsDetails(Id);
	    }
}

