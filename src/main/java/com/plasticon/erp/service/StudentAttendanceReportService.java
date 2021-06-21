package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.StudentAttendanceReport;
import com.plasticon.erp.repository.StudentAttendanceReportRepository;



@Service
public class StudentAttendanceReportService {
	@Autowired
	StudentAttendanceReportRepository studentAttendanceReportRepository;
		public List<StudentAttendanceReport> getStudentAttendanceReport() {
			return studentAttendanceReportRepository.findAll();

		}

		public void saveStudentAttendanceReport(StudentAttendanceReport attendance) {
			studentAttendanceReportRepository.save(attendance);
		}

		@Transactional
		public void removeStudentAttendanceReport(int id) {
			studentAttendanceReportRepository.deleteById(id);
		}

}
