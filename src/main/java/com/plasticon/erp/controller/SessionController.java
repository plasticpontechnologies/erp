package com.plasticon.erp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.plasticon.erp.model.Session;
import com.plasticon.erp.service.SessionService;

@RestController
@RequestMapping(value="/session")
public class SessionController {
	@Autowired
	SessionService sessionService;
	
	
	@GetMapping(value="/getsessiondetails")
	public List<Session> getSessionDetails(){
		return sessionService.getSessionDetails();
	}
	
	
	@PostMapping(value="/savesessiondetails",consumes="application/json")
	public void saveSessionDetails(@RequestBody Session session) {
		sessionService.saveSessionDetails(session);
	}
	
	
	@DeleteMapping(value="/deletesessiondetails/{sessionId}")
	public void deleteSessionDetails(@PathVariable int sessionId) {
		sessionService.deleteSessionDetails(sessionId);
	}
}
