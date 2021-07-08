package com.plasticon.erp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.plasticon.erp.model.SearchQuestions;
import com.plasticon.erp.service.SearchQuestionsService;

@RestController
@RequestMapping("/searchquestions")
public class SearchQuestionsController {

	@Autowired
	SearchQuestionsService searchQuestionsService;
	
	@RequestMapping(value="/getsearchquestions", method = RequestMethod.GET)
	public List<SearchQuestions> getSearchQuestions() {
		return searchQuestionsService.getSearchQuestions();
	}
}
