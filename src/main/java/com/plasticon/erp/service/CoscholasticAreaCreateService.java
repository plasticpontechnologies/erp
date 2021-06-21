package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.CoscholasticAreaCreateDetails;
import com.plasticon.erp.repository.CoscholasticAreaCreateRepository;


@Service
public class CoscholasticAreaCreateService {
	
	@Autowired
	 CoscholasticAreaCreateRepository coscholasticAreaCreateRepository;
		
		public List<CoscholasticAreaCreateDetails> getCoscholasticAreaCreateDetails() {
			return coscholasticAreaCreateRepository.findAll();
		}
		 

		public void saveCoscholasticAreaCreateDetails(CoscholasticAreaCreateDetails coscholasticAreaCreate) {
			coscholasticAreaCreateRepository.save(coscholasticAreaCreate);
		}

		@Transactional
		public void removeCoscholasticAreaCreateDetails(int id) {
		      coscholasticAreaCreateRepository.deleteById(id);
		}

}
