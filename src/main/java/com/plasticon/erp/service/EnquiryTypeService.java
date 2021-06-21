package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.EnquiryType;
import com.plasticon.erp.repository.EnquiryTypeRepository;

@Service
public class EnquiryTypeService {
	@Autowired
	EnquiryTypeRepository enquiryTypeRepository;
	
		public List<EnquiryType> getEnquiryType() {
			return enquiryTypeRepository.findAll();

		}
		public void saveEnquiryType(EnquiryType MasterEntry) {
			enquiryTypeRepository.save(MasterEntry);
			
		

		}
		@Transactional
		public void removeEnquiryType(int id) {
			enquiryTypeRepository.deleteById(id);
		}

}
