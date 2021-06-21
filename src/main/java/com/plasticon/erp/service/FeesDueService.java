package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.FeesDue;
import com.plasticon.erp.repository.FeesDueRepository;
@Service
public class FeesDueService {
	@Autowired
	private FeesDueRepository feesDueRepository;
	
	public List<FeesDue> getFeesDue() {
		return feesDueRepository.findAll();

	}

	public void saveFeesDue(FeesDue feesDue) {
		feesDueRepository.save(feesDue);
	}

	@Transactional
	public void removeFeesDue(int id) {
		feesDueRepository.deleteById(id);
	}

}
