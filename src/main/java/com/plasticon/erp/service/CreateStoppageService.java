package com.plasticon.erp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.plasticon.erp.model.CreateStoppage;
import com.plasticon.erp.repository.CreateStoppageRepository;

@Service
public class CreateStoppageService
{
@Autowired
CreateStoppageRepository createStoppageRepository;
public void saveCreateStoppage(CreateStoppage createStoppage) {
	createStoppageRepository.save(createStoppage);
}
public List<CreateStoppage> getCreateStoppage() {
	return createStoppageRepository.findAll();
}
public void deleteCreateStoppage(int crstId) {
	createStoppageRepository.deleteById(crstId);
}
}
