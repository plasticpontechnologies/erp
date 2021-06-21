package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.PositionDetails;
import com.plasticon.erp.repository.PositionRepository;


@Service
public class PositionService {
	@Autowired
	PositionRepository positionRepository;
		public List<PositionDetails> getPositonDetails() {
			return positionRepository.findAll();

		}

		public void savePositionDetails(PositionDetails p) {
			positionRepository.save(p);
		}

		@Transactional
		public void removePositionDetails(int id) {
			positionRepository.deleteById(id);
		}

}
