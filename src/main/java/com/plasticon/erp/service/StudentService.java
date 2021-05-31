package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.StaffDetails;
import com.plasticon.erp.model.StudentDetails;
import com.plasticon.erp.repository.StudentRepository;


@Service
public class StudentService {
	@Autowired
	StudentRepository studentRepository;
		public List<StudentDetails> getStudentDetails() {
			return studentRepository.findAll();

		}

		public void saveStudentDetails(StudentDetails student) {
			studentRepository.save(student);
			

		}
		@Transactional
		public void removeStudentDetails(StudentDetails fullName) {
			studentRepository.delete(fullName);
		}

}
