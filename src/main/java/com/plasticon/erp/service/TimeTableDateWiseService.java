package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.TimeTableDateWise;
import com.plasticon.erp.model.TimeTableDayWise;
import com.plasticon.erp.repository.TimeTableDateWiseRepository;
import com.plasticon.erp.repository.TimeTableDayWiseRepository;

@Service
public class TimeTableDateWiseService {
	@Autowired
	TimeTableDateWiseRepository timeTableDateWiseRepository;
		
		public List<TimeTableDateWise> getTimeTableDateWise() {
			return timeTableDateWiseRepository.findAll();
		}
		 

		public void saveTimeTableDateWise(TimeTableDateWise timetable) {
			timeTableDateWiseRepository.save(timetable);
		}

		@Transactional
		public void removeTimeTableDateWise(int id) {
			timeTableDateWiseRepository.deleteById(id);
		}

}
