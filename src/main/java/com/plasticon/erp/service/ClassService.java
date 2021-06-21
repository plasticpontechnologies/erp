package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.ClassDetails;
import com.plasticon.erp.model.UserDetails;
import com.plasticon.erp.repository.ClassRepository;


@Service
public class ClassService {
	@Autowired
	ClassRepository classRepository;
		public List<ClassDetails> getClassDetails() {
			return classRepository.findAll();

		}
		public void saveClassDetails(ClassDetails cla) {
			classRepository.save(cla);
			
		

		}
		@Transactional
		public void removeClassDetails(int id) {
			classRepository.deleteById(id);
		}

}
