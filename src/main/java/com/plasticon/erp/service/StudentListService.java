package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.StudentList;
import com.plasticon.erp.repository.StudentListRepository;

@Service
public class StudentListService {
	@Autowired
	private StudentListRepository studentListRepository;
	
	public List<StudentList> getStudentList() {
		return studentListRepository.findAll();

	}

	public void saveStudentList(StudentList studentList) {
		studentListRepository.save(studentList);
	}

	@Transactional
	public void removeStudentList(int id) {
		studentListRepository.deleteById(id);
	}

	

}
