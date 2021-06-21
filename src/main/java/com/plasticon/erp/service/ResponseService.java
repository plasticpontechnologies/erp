package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.Response;
import com.plasticon.erp.repository.ResponseRepository;



@Service
public class ResponseService {
	@Autowired
	ResponseRepository responseRepository;
	
		public List<Response> getResponse() {
			return responseRepository.findAll();

		}
		public void saveResponse(Response MasterEntry) {
			responseRepository.save(MasterEntry);
			
		

		}
		@Transactional
		public void removeResponse(int id) {
			responseRepository.deleteById(id);
		}
}
