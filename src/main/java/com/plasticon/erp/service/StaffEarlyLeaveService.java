package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.StaffEarlyLeave;

import com.plasticon.erp.repository.StaffEarlyLeaveRepository;


@Service
public class StaffEarlyLeaveService {
	@Autowired
	StaffEarlyLeaveRepository staffEarlyLeaveRepository;
		public List<StaffEarlyLeave> getStaffEarlyLeave() {
			return staffEarlyLeaveRepository.findAll();

		}

		public void saveStaffEarlyLeave(StaffEarlyLeave attendance) {
			staffEarlyLeaveRepository.save(attendance);
		}

		@Transactional
		public void removeStaffEarlyLeave(int id) {
			staffEarlyLeaveRepository.deleteById(id);
		}

}
