package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.TerminationReason;
import com.plasticon.erp.repository.TerminationReasonRepository;

@Service
public class TerminationReasonService {
	
	@Autowired
	TerminationReasonRepository terminationReasonRepository;
	
	public List<TerminationReason> getTerminationReason() {
		return terminationReasonRepository.findAll();

	}

	public void saveTerminationReason(TerminationReason terminationReason) {
		terminationReasonRepository.save(terminationReason);
	}

	@Transactional
	public void removeTerminationReason(int id) {
		terminationReasonRepository.deleteById(id);
	}

	

}
