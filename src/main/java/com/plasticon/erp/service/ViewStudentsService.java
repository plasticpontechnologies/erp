package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.ViewStudents;
import com.plasticon.erp.repository.ViewStudentsRepository;

@Service
public class ViewStudentsService {
	@Autowired
	ViewStudentsRepository viewStudentsRepository;

	public List<ViewStudents> getViewStudents() {
		return viewStudentsRepository.findAll();

	}

	public void saveViewStudents(ViewStudents students) {
		viewStudentsRepository.save(students);
	}

	@Transactional
	public void removeViewStudents(int id) {
		viewStudentsRepository.deleteById(id);
	}

}
