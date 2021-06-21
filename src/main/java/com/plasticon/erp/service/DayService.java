package com.plasticon.erp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.DayDetails;
import com.plasticon.erp.repository.DayRepository;

@Service
public class DayService {
	@Autowired
	DayRepository dayRepository;
		public List<DayDetails> getDayDetails() {
			return dayRepository.findAll();

		}

}
