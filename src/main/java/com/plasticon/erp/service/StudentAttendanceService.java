package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.StaffAttendance;
import com.plasticon.erp.model.StudentAttendance;
import com.plasticon.erp.repository.StaffAttendanceRepository;
import com.plasticon.erp.repository.StudentAttendanceRepository;

@Service
public class StudentAttendanceService {
	@Autowired
	StudentAttendanceRepository studentAttendanceRepository;
		public List<StudentAttendance> getStudentAttendance() {
			return studentAttendanceRepository.findAll();

		}

		public void saveStudentAttendance(StudentAttendance attendance) {
			studentAttendanceRepository.save(attendance);
		}

		@Transactional
		public void removeStudentAttendance(int id) {
			studentAttendanceRepository.deleteById(id);
		}

}
