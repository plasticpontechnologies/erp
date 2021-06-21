package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.StudentUpload;
import com.plasticon.erp.repository.StudentUploadRepository;

@Service
public class StudentUploadService {
	@Autowired
	StudentUploadRepository studentUploadRepository;
	
	public List<StudentUpload> getStudentUpload() {
		return studentUploadRepository.findAll();

	}

	public void saveStudentUpload(StudentUpload students) {
		studentUploadRepository.save(students);
	}

	@Transactional
	public void removeStudentUpload(int id) {
		studentUploadRepository.deleteById(id);
	}

}
