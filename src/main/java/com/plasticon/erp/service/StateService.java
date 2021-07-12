package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.State;
import com.plasticon.erp.repository.StateRepository;

@Service
public class StateService {
	
	@Autowired
	StateRepository stateRepository;
	
	public List<State> getState() {
		return stateRepository.findAll();
	}
	
	public void saveState(State state) {
		stateRepository.save(state);
	}
	
	@Transactional
	public void removeState(int id) {
		stateRepository.deleteById(id);
	}

}
