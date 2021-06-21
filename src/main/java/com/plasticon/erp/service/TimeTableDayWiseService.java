package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.plasticon.erp.model.TimeTableDayWise;

import com.plasticon.erp.repository.TimeTableDayWiseRepository;

@Service
public class TimeTableDayWiseService {
	@Autowired
	TimeTableDayWiseRepository timeTableDayWiseRepository;
		
		public List<TimeTableDayWise> getTimeTableDayWise() {
			return timeTableDayWiseRepository.findAll();
		}
		 

		public void saveTimeTableDayWise(TimeTableDayWise timetable) {
			timeTableDayWiseRepository.save(timetable);
		}

		@Transactional
		public void removeTimeTableDayWise(int id) {
			timeTableDayWiseRepository.deleteById(id);
		}
	

}
