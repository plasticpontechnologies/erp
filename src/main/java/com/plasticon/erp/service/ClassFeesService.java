package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.ClassFees;
import com.plasticon.erp.repository.ClassFeesRepository;

@Service
public class ClassFeesService { 
	@Autowired
	private ClassFeesRepository classFeesRepository;
	
	public List<ClassFees> getClassFees() {
		return classFeesRepository.findAll();

	}

	public void saveClassFees(ClassFees classFees) {
		classFeesRepository.save(classFees);
	}

	@Transactional
	public void removeClassFees(int id) {
		classFeesRepository.deleteById(id);
	}


}
