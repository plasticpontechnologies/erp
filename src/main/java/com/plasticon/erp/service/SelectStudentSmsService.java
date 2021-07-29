package com.plasticon.erp.service;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.plasticon.erp.model.RouteMessage;
import com.plasticon.erp.model.SelectStudentSms;
import com.plasticon.erp.repository.SelectStudentSmsRepository;


@Service
public class SelectStudentSmsService {
	
	
	@Autowired
	SelectStudentSmsRepository selectstudentsmsRepository;

	
	public List<SelectStudentSms> getSelectStudentSms() {
		return selectstudentsmsRepository.findAll();

	}
	public void saveSelectStudentSms(SelectStudentSms selectstudentsms) {
		selectstudentsmsRepository.save(selectstudentsms);
		
		}
	
	@Transactional
	public void removeSelectStudentSms(int studentTypeId) {
		selectstudentsmsRepository.deleteById(studentTypeId);
	}
	
		
	}

