package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.StaffWorkingHour;
import com.plasticon.erp.repository.StaffWorkingHourRepository;


@Service
public class StaffWorkingHourService {
	@Autowired
	StaffWorkingHourRepository staffWorkingHourRepository;
		public List<StaffWorkingHour> getStaffWorkingHour() {
			return staffWorkingHourRepository.findAll();

		}

		public void saveStaffWorkingHour(StaffWorkingHour attendance) {
			staffWorkingHourRepository.save(attendance);
		}

		@Transactional
		public void removeStaffWorkingHour(int id) {
			staffWorkingHourRepository.deleteById(id);
		}

}
