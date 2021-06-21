package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.Events;

import com.plasticon.erp.repository.EventsRepository;

@Service
public class EventsService {
	
	@Autowired
	EventsRepository eventsRepository;

	public List<Events> getEvents() {
		return eventsRepository.findAll();

	}

	public void saveEvents(Events events) {
		eventsRepository.save(events);
		
	}
	@Transactional
	public void removeEvents(int id) {
		eventsRepository.deleteById(id);
	
	}
}
