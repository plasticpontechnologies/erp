package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.StaffLateArrival;
import com.plasticon.erp.repository.StaffLateArrivalRepository;


@Service
public class StaffLateArrivalService {
	@Autowired
	StaffLateArrivalRepository staffLateArrivalRepository;
		public List<StaffLateArrival> getStaffLateArrival() {
			return staffLateArrivalRepository.findAll();

		}

		public void saveStaffLateArrival(StaffLateArrival attendance) {
			staffLateArrivalRepository.save(attendance);
		}

		@Transactional
		public void removeStaffLateArrival(int id) {
			staffLateArrivalRepository.deleteById(id);
		}


}
