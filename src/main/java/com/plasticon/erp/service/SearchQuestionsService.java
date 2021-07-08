package com.plasticon.erp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.SearchQuestions;
import com.plasticon.erp.repository.SearchQuestionsRepository;

@Service
public class SearchQuestionsService {
	
	@Autowired
	SearchQuestionsRepository searchQuestionsRepository;
	
	public List<SearchQuestions> getSearchQuestions() {
		return searchQuestionsRepository.findAll();
	}
	
	public void savesearchQuestions(SearchQuestions searchquestions) {
		searchQuestionsRepository.save(searchquestions);
	}

}
