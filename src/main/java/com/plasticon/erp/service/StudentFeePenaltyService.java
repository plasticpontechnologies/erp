package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.StudentFeePenalty;
import com.plasticon.erp.repository.StudentFeePenaltyRepository;


@Service
public class StudentFeePenaltyService {
	@Autowired
	StudentFeePenaltyRepository studentFeePenaltyRepository;
		public List<StudentFeePenalty> getStudentFeePenalty() {
			return studentFeePenaltyRepository.findAll();

		}

		public void saveStudentFeePenalty(StudentFeePenalty ManagePenalty) {
			studentFeePenaltyRepository.save(ManagePenalty);
			

		}
		@Transactional
		public void removeStudentFeePenalty(int id) {
			studentFeePenaltyRepository.deleteById(id);
		}

}
