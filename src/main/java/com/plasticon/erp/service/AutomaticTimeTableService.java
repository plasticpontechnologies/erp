package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.AutomaticTimeTable;
import com.plasticon.erp.repository.AutomaticTimeTableRepository;

@Service
public class AutomaticTimeTableService {
	@Autowired
	AutomaticTimeTableRepository automaticTimeTableRepository;
		public List<AutomaticTimeTable> getAutomaticTimeTable() {
			return automaticTimeTableRepository.findAll();

		}

		public void saveAutomaticTimeTable(AutomaticTimeTable timetable) {
			automaticTimeTableRepository.save(timetable);
		}

		@Transactional
		public void removeAutomaticTimeTable(int id) {
			automaticTimeTableRepository.deleteById(id);
		}
	

}
