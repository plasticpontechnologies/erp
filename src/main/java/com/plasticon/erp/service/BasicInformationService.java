package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.BasicInformation;
import com.plasticon.erp.repository.BasicInformationRepository;

@Service
public class BasicInformationService {
	
	@Autowired
	BasicInformationRepository basicInformationRepository;
	
	public List<BasicInformation> getBasicInformation() {
		return basicInformationRepository.findAll();
	}
	
	public void saveBasicInformation(BasicInformation basicinfo) {
		basicInformationRepository.save(basicinfo);
	}
	
	@Transactional
	public void removeBasicInformation(int id) {
		basicInformationRepository.deleteById(id);
	}

}
