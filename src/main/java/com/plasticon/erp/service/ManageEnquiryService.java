package com.plasticon.erp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.plasticon.erp.model.ManageEnquiry;
import com.plasticon.erp.repository.ManageEnquiryRepository;

@Service
public class ManageEnquiryService {
@Autowired
ManageEnquiryRepository  manageEnquiryRepository;

		public List<ManageEnquiry> getManageEnquiryDetails(){
				return manageEnquiryRepository.findAll();
			}
		public void saveManageEnquiryDetails(ManageEnquiry manageEnquiry) {
			manageEnquiryRepository.save(manageEnquiry);
			}
		public void deletManageEnquiryDetailsById(int manageEnquiryId) {
			manageEnquiryRepository.deleteById(manageEnquiryId);
			}
}
