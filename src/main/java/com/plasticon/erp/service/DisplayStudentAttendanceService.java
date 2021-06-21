package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.DisplayStudentAttendance;
import com.plasticon.erp.repository.DisplayStudentAttendanceRepository;



@Service
public class DisplayStudentAttendanceService {
	@Autowired
	DisplayStudentAttendanceRepository displayStudentAttendanceRepository;
		public List<DisplayStudentAttendance> getDisplayStudentAttendance() {
			return displayStudentAttendanceRepository.findAll();

		}

		public void saveDisplayStudentAttendance(DisplayStudentAttendance attendance) {
			displayStudentAttendanceRepository.save(attendance);
		}

		@Transactional
		public void removeDisplayStudentAttendance(int id) {
			displayStudentAttendanceRepository.deleteById(id);
		}

}
