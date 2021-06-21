package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.DisplayStaffAttendance;

import com.plasticon.erp.repository.DisplayStaffAttendanceRepository;


@Service
public class DisplayStaffAttendanceService {
	@Autowired
	DisplayStaffAttendanceRepository displayStaffAttendanceRepository;
		public List<DisplayStaffAttendance> getDisplayStaffAttendance() {
			return displayStaffAttendanceRepository.findAll();

		}

		public void saveDisplayStaffAttendance(DisplayStaffAttendance attendance) {
			displayStaffAttendanceRepository.save(attendance);
		}

		@Transactional
		public void removeDisplayStaffAttendance(int id) {
			displayStaffAttendanceRepository.deleteById(id);
		}

}
