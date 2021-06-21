package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.StudentAttendance;
import com.plasticon.erp.model.StudentLateAndEarlyDeparture;
import com.plasticon.erp.repository.StudentAttendanceRepository;
import com.plasticon.erp.repository.StudentLateAndEarlyDepartureRepository;

@Service
public class StudentLateAndEarlyDepartureService {
	@Autowired
	StudentLateAndEarlyDepartureRepository studentLateAndEarlyDepartureRepository;
		public List<StudentLateAndEarlyDeparture> getStudentLateAndEarlyDeparture() {
			return studentLateAndEarlyDepartureRepository.findAll();

		}

		public void saveStudentLateAndEarlyDeparture(StudentLateAndEarlyDeparture attendance) {
			studentLateAndEarlyDepartureRepository.save(attendance);
		}

		@Transactional
		public void removeStudentLateAndEarlyDeparture(int id) {
			studentLateAndEarlyDepartureRepository.deleteById(id);
		}
	

}
