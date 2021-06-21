package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.AdmissionProcessMasterEntry;

import com.plasticon.erp.repository.AdmissionProcessMasterEntryRepository;


@Service
public class AdmissionProcessMasterEntryService {
	@Autowired
	AdmissionProcessMasterEntryRepository admissionProcessMasterEntryRepository;
		public List<AdmissionProcessMasterEntry> getAdmissionProcessMasterEntry() {
			return admissionProcessMasterEntryRepository.findAll();

		}

		public void saveAdmissionProcessMasterEntry(AdmissionProcessMasterEntry admission) {
			admissionProcessMasterEntryRepository.save(admission);
		}

		@Transactional
		public void removeAdmissionProcessMasterEntry(int id) {
			admissionProcessMasterEntryRepository.deleteById(id);
		}

}
