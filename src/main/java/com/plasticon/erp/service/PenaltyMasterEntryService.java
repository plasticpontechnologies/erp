package com.plasticon.erp.service;

import java.util.List;


import javax.transaction.Transactional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.PenaltyMasterEntry;
import com.plasticon.erp.repository.PenaltyMasterEntryRepository;

@Service
public class PenaltyMasterEntryService {
	@Autowired
	PenaltyMasterEntryRepository penaltyMasterEntryRepository;
	
	public List<PenaltyMasterEntry> getPenaltyMasterEntry() {
		return penaltyMasterEntryRepository.findAll();

	}

	public void savePenaltyMasterEntry(PenaltyMasterEntry ManagePenalty) {
		penaltyMasterEntryRepository.save(ManagePenalty);
	}

	@Transactional
	public void removePenaltyMasterEntry(int id) {
		penaltyMasterEntryRepository.deleteById(id);
	}

}
