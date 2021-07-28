package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.QuestionSelection;
import com.plasticon.erp.repository.QuestionSelectionRepository;

@Service
public class QuestionSelectionService {
	
	@Autowired
	QuestionSelectionRepository questionSelectionRepository;
	
	public List<QuestionSelection> getQuestionSelection() {
		return questionSelectionRepository.findAll();
	}
	
	public void saveQuestionSelection(QuestionSelection questionSelection) {
		questionSelectionRepository.save(questionSelection);
	}
	
	@Transactional
	public void removeQuestionSelection(int id) {
		questionSelectionRepository.deleteById(id);
	}

}
