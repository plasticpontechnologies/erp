package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.StudentAttendanceSummary;
import com.plasticon.erp.repository.StudentAttendanceSummaryRepository;

@Service
public class StudentAttendanceSummaryService {
	@Autowired
	StudentAttendanceSummaryRepository studentAttendanceSummaryRepository;
		public List<StudentAttendanceSummary> getStudentAttendanceSummary() {
			return studentAttendanceSummaryRepository.findAll();

		}

		public void saveStudentAttendanceSummary(StudentAttendanceSummary attendance) {
			studentAttendanceSummaryRepository.save(attendance);
		}

		@Transactional
		public void removeStudentAttendanceSummary(int id) {
			studentAttendanceSummaryRepository.deleteById(id);
		}

}
