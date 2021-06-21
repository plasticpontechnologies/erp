package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.QuestionBank;
import com.plasticon.erp.repository.QuestionBankRepository;

@Service
public class QuestionBankService {
	
	@Autowired
	QuestionBankRepository questionBankRepository;
	public List<QuestionBank> getQuestionBank() {
		return questionBankRepository.findAll();
	}
	
	public void saveQuestionBank(QuestionBank question) {
		questionBankRepository.save(question);
	}
	
	@Transactional
	public void removeQuestionBank(int id) {
		questionBankRepository.deleteById(id);
	}
	

}
