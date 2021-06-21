package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.Holidays;
import com.plasticon.erp.repository.HolidaysRepository;

@Service
public class HolidaysService {

	@Autowired
	HolidaysRepository holidaysRepository;

	public List<Holidays> getHolidays() {
		return holidaysRepository.findAll();

	}

	public void saveHolidays(Holidays holidays) {
		holidaysRepository.save(holidays);

	}
@Transactional
	public void removeHolidays(int id) {
		holidaysRepository.deleteById(id);

	}
}
