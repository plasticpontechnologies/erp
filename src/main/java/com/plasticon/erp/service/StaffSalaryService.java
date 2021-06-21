package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.StaffSalaryDetails;

import com.plasticon.erp.repository.StaffSalaryRepository;
@Service
public class StaffSalaryService {
	
	@Autowired
	 StaffSalaryRepository staffSalaryRepository;
		
		public List<StaffSalaryDetails> getStaffSalaryDetails() {
			return staffSalaryRepository.findAll();
		}
		 

		public void saveStaffSalaryDetails(StaffSalaryDetails staffSalary) {
			staffSalaryRepository.save(staffSalary);
		}

		@Transactional
		public void removeStaffSalaryDetails(int id) {
		      staffSalaryRepository.deleteById(id);
		}

}
