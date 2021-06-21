package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.ModifyStaffInAndOutDetails;
import com.plasticon.erp.repository.ModifyStaffInAndOutRepository;

@Service
public class ModifyStaffInAndOutService {

	@Autowired
	 ModifyStaffInAndOutRepository modifyStaffInAndOutRepository;
		
		public List<ModifyStaffInAndOutDetails> getModifyStaffInAndOutDetails() {
			return modifyStaffInAndOutRepository.findAll();

		}

		public void saveModifyStaffInAndOutDetails(ModifyStaffInAndOutDetails modifystaffinandout) {
			modifyStaffInAndOutRepository.save(modifystaffinandout);
		}

		@Transactional
		public void removeModifyStaffInAndOutDetails(int id) {
			modifyStaffInAndOutRepository.deleteById(id);
		}
}
