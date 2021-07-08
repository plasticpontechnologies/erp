package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.classes;
import com.plasticon.erp.repository.classRepository;




@Service
public class ClassService {
	@Autowired
	classRepository cRepository;
		public List<classes> getClassDetails() {
			return cRepository.findAll();

		}
		public void saveClassDetails(classes cla) {
			cRepository.save(cla);
			
		

		}
		@Transactional
		public void removeClassDetails(int id) {
			cRepository.deleteById(id);
		}

}
