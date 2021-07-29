package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.StaffDetails;
import com.plasticon.erp.repository.StaffRepository;


@Service
public class StaffService {
	@Autowired
	StaffRepository staffRepository;
		public List<StaffDetails> getStaffDetails() {
			return staffRepository.findAll();

		}
		
		public List<StaffDetails> findByStaffDetails() {
			return staffRepository.findByStaffDetails();
		}

		public void saveStaffDetails(StaffDetails staff) {
			staffRepository.save(staff);
		}

		@Transactional
		public void removeStaffDetails(int id) {
			staffRepository.deleteById(id);
		}
		

}
