package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.PositionDetails;
import com.plasticon.erp.model.Questions;
import com.plasticon.erp.repository.QuestionsRepository;

@Service
public class QuestionsService {
	
	@Autowired
	QuestionsRepository questionsRepository;

	public List<Questions> getQuestionsDetails() {
		return questionsRepository.findAll();

	}

	public void saveQuestionsDetails(Questions  questions) {
		questionsRepository.save(questions);
	}

	@Transactional
	public void removeQuestionsDetails(int id) {
		questionsRepository.deleteById(id);
	}
}
