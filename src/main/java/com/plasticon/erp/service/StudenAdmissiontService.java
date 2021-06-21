package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.StaffDetails;
import com.plasticon.erp.model.StudentAdmission;
import com.plasticon.erp.repository.StudentAdmissionRepository;


@Service
public class StudenAdmissiontService {
	@Autowired
	StudentAdmissionRepository studentRepository;
		public List<StudentAdmission> getStudentDetails() {
			return studentRepository.findAll();

		}

		public void saveStudentDetails(StudentAdmission student) {
			studentRepository.save(student);
			

		}
		@Transactional
		public void removeStudentDetails(int id) {
			studentRepository.deleteById(id);
		}

}
