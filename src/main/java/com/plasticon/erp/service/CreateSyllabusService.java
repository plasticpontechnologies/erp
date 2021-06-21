package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.CreateSyllabus;
import com.plasticon.erp.repository.CreateSyllabusRepository;

@Service
public class CreateSyllabusService {
	@Autowired
	private CreateSyllabusRepository createSyllabusRepository;
	
	public List<CreateSyllabus> getCreateSyllabus() {
		return createSyllabusRepository.findAll();

	}

	public void saveCreateSyllabus(CreateSyllabus createSyllabus) {
		createSyllabusRepository.save(createSyllabus);
	}

	@Transactional
	public void removeCreateSyllabus(int id) {
		createSyllabusRepository.deleteById(id);
	}

}
