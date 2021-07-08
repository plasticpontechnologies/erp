package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.QuestionsBank;
import com.plasticon.erp.repository.QuestionsBankRepository;




@Service
public class QuestionsBankService {
	@Autowired
	QuestionsBankRepository questionBankRepository;
	public List<QuestionsBank> getQuestionsBank() {
		return questionBankRepository.findAll();
	}
	
	public void saveQuestionsBank(QuestionsBank question) {
		questionBankRepository.save(question);
	}
	
	@Transactional
	public void removeQuestionsBank(int id) {
		questionBankRepository.deleteById(id);
	}
	
	  public List<QuestionsBank> findBySubId(int suId) { return
	  questionBankRepository.findBySubId(suId); }
	 
	
}

