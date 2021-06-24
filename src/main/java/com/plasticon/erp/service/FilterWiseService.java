package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.EnquiryToFilterwise;
import com.plasticon.erp.model.SendSmsToStaff;
import com.plasticon.erp.repository.FilterWiseRepository;

@Service
public class FilterWiseService {

	@Autowired
	public FilterWiseRepository filterwiseRepository;
	
	
	public List<EnquiryToFilterwise> getEnquiryToFilterwise() {
		return filterwiseRepository.findAll();

	}
	public void saveEnquiryToFilterwise(EnquiryToFilterwise filterwise) {
		filterwiseRepository.save(filterwise);
			}
	
	@Transactional
	public void removeEnquiryToFilterwise(int id) {
		filterwiseRepository.deleteById(id);
	}
}
