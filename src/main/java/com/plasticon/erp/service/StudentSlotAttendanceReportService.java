package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.StudentSlotAttendanceReport;
import com.plasticon.erp.repository.StudentSlotAttendanceReportRepository;


@Service
public class StudentSlotAttendanceReportService {
	@Autowired
	StudentSlotAttendanceReportRepository studentSlotAttendanceReportRepository;
		public List<StudentSlotAttendanceReport> getStudentSlotAttendanceReport() {
			return studentSlotAttendanceReportRepository.findAll();

		}

		public void saveStudentSlotAttendanceReport(StudentSlotAttendanceReport attendance) {
			studentSlotAttendanceReportRepository.save(attendance);
		}

		@Transactional
		public void removeStudentSlotAttendanceReport(int id) {
			studentSlotAttendanceReportRepository.deleteById(id);
		}

}
