package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.MySchedule;
import com.plasticon.erp.repository.MyScheduleRepository;


@Service
public class MyScheduleService {
	@Autowired
	MyScheduleRepository myScheduleRepository;
		public List<MySchedule> getMySchedule() {
			return myScheduleRepository.findAll();

		}

		public void saveMyScheduleSchedule(MySchedule timetable) {
			myScheduleRepository.save(timetable);
			

		}
		@Transactional
		public void removeMySchedule(int id) {
			myScheduleRepository.deleteById(id);
		}

}
