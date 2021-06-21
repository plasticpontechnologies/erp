package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.ResultSetupCoscholasticDetails;
import com.plasticon.erp.repository.ResultSetupCoscholasticRepository;



@Service
public class ResultSetupCoscholasticService {

	@Autowired
	ResultSetupCoscholasticRepository resultSetupCoscholasticRepository;
	public List<ResultSetupCoscholasticDetails> getResultSetupCoscholasticDetails() {
		return resultSetupCoscholasticRepository.findAll();

	}

	public void saveResultSetupCoscholasticDetails(ResultSetupCoscholasticDetails resultsetupcoscholastic) {
		resultSetupCoscholasticRepository.save(resultsetupcoscholastic);
	}

	@Transactional
	public void removeResultSetupCoscholasticDetails(int id) {
		resultSetupCoscholasticRepository.deleteById(id);
	}
}
