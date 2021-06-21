package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.PenaltyRules;

import com.plasticon.erp.repository.PenaltyRulesRepository;


@Service
public class PenaltyRulesService {
	@Autowired
	PenaltyRulesRepository penaltyRulesRepository;
		public List<PenaltyRules> getPenaltyRules() {
			return penaltyRulesRepository.findAll();

		}

		public void savePenaltyRules(PenaltyRules ManagePenalty) {
			penaltyRulesRepository.save(ManagePenalty);
		}

		@Transactional
		public void removePenaltyRules(int id) {
			penaltyRulesRepository.deleteById(id);
		}

}
