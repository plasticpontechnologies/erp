package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.StartAdmission;
import com.plasticon.erp.repository.StartAdmissionRepository;

@Service
public class StartAdmissionService {
	@Autowired
	StartAdmissionRepository startAdmissionRepository;
		public List<StartAdmission> getStartAdmission() {
			return startAdmissionRepository.findAll();

		}

		public void saveStartAdmission(StartAdmission admission) {
			startAdmissionRepository.save(admission);
		}

		@Transactional
		public void removeStartAdmission(int id) {
			startAdmissionRepository.deleteById(id);
		}
		

}
