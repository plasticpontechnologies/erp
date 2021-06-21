package com.plasticon.erp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.plasticon.erp.model.Session;
import com.plasticon.erp.repository.SessionRepository;
@Service
public class SessionService {
	@Autowired
	SessionRepository sessionRepository;

		public List<Session> getSessionDetails(){
			return sessionRepository.findAll();
		}
		public void saveSessionDetails(Session session) {
			sessionRepository.save(session);
		}
		public void deleteSessionDetails(int sessionId) {
			sessionRepository.deleteById(sessionId);
		}
}
