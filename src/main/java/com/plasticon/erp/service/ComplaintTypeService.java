package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.ComplaintType;

import com.plasticon.erp.repository.ComplaintTypeRepository;

@Service
public class ComplaintTypeService {
	@Autowired
	ComplaintTypeRepository complaintTypeRepository;
		public List<ComplaintType> getComplaintType() {
			return complaintTypeRepository.findAll();

		}
		public void saveComplaintType(ComplaintType MasterEntry) {
			complaintTypeRepository.save(MasterEntry);
			
		

		}
		@Transactional
		public void removeComplaintType(int id) {
			complaintTypeRepository.deleteById(id);
		}

}
