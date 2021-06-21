package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.ViewSyllabus;
import com.plasticon.erp.repository.ViewSyllabusRepository;

@Service
public class ViewSyllabusService {
	@Autowired
	private ViewSyllabusRepository viewSyllabusRepository;
	
	public List<ViewSyllabus> getViewSyllabus() {
		return viewSyllabusRepository.findAll();

	}

	public void saveViewSyllabus(ViewSyllabus viewSyllabus) {
		viewSyllabusRepository.save(viewSyllabus);
	}

	@Transactional
	public void removeViewSyllabus(int id) {
		viewSyllabusRepository.deleteById(id);
	}

}
