package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.ResultSetupScholasticDetails;
import com.plasticon.erp.repository.ResultSetupScholasticRepository;



@Service
public class ResultSetupScholasticService {

	@Autowired
	ResultSetupScholasticRepository resultSetupScholasticRepository;
	public List<ResultSetupScholasticDetails> getResultSetupScholasticDetails() {
		return resultSetupScholasticRepository.findAll();

	}

	public void saveResultSetupScholasticDetails(ResultSetupScholasticDetails resultsetupscholastic) {
		resultSetupScholasticRepository.save(resultsetupscholastic);
	}

	@Transactional
	public void removeResultSetupScholasticDetails(int id) {
		resultSetupScholasticRepository.deleteById(id);
	}
}
