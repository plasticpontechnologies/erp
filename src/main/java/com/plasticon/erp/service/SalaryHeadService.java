package com.plasticon.erp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.plasticon.erp.model.SalaryHead;
import com.plasticon.erp.repository.SalaryHeadRepository;

@Service
public class SalaryHeadService {
	@Autowired
	SalaryHeadRepository salaryHeadRepository;

		public List<SalaryHead> getSalaryHeadDetails(){
			return salaryHeadRepository.findAll();
		}
		public void saveSalaryHeadDetails(SalaryHead salaryHead) {
			salaryHeadRepository.save(salaryHead);
		}
		public void deleteSalaryHeadDetails(int salaryHeadId) {
			salaryHeadRepository.deleteById(salaryHeadId);
		}
}
