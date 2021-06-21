package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.ModifyStaffDocumentDetails;
import com.plasticon.erp.repository.ModifyStaffDocumentRepository;

@Service
public class ModifyStaffDocumentService {

	@Autowired
	 ModifyStaffDocumentRepository modifyStaffDocumentRepository;
		
		public List<ModifyStaffDocumentDetails> getModifyStaffDocumentDetails() {
			return modifyStaffDocumentRepository.findAll();

		}

		public void saveModifyStaffDocumentDetails(ModifyStaffDocumentDetails modifystaffdocument) {
			modifyStaffDocumentRepository.save(modifystaffdocument);
		}

		@Transactional
		public void removeModifyStaffDocumentDetails(int id) {
			modifyStaffDocumentRepository.deleteById(id);
		}
}
