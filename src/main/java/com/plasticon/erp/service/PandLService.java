package com.plasticon.erp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.PandL;
import com.plasticon.erp.repository.PandLRepository;

@Service
public class PandLService {
@Autowired
PandLRepository pandLRepository;
public List<PandL> getPandLDetails(){
	return pandLRepository.findAll();
}
public void savepandLDetails(PandL pandL) {
	pandLRepository.save(pandL);
}
public void deletePandLDetails(int id) {
	pandLRepository.deleteById(id);
}
}
