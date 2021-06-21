package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.Birthdays;
import com.plasticon.erp.model.SurveyReport;
import com.plasticon.erp.repository.BirthdaysRepository;

@Service
public class BirthdaysService {

	@Autowired
	BirthdaysRepository birthdaysRepository;
	
	public List<Birthdays> getBirthdays() {
		return birthdaysRepository.findAll();

	}

	public void saveBirthdays(Birthdays birthday) {
		birthdaysRepository.save(birthday);
		
	}
	@Transactional
	public void removeBirthdays(int id) {
		birthdaysRepository.deleteById(id);
	}

}
