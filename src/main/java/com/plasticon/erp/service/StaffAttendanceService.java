package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.StaffAttendance;
import com.plasticon.erp.repository.StaffAttendanceRepository;

@Service
public class StaffAttendanceService {
	@Autowired
	StaffAttendanceRepository staffAttendanceRepository;
		public List<StaffAttendance> getStaffAttendance() {
			return staffAttendanceRepository.findAll();

		}

		public void saveStaffAttendance(StaffAttendance attendance) {
			staffAttendanceRepository.save(attendance);
		}

		@Transactional
		public void removeStaffAttendance(int id) {
			staffAttendanceRepository.deleteById(id);
		}

}
