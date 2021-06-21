package com.plasticon.erp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.plasticon.erp.model.OnlineExamTopic;
import com.plasticon.erp.service.OnlineExamTopicService;

@RestController
@RequestMapping("/topic")
public class OnlineExamTopicController {
	
	@Autowired
	 OnlineExamTopicService  onlineExamTopicService;
	 @RequestMapping(value = "/gettopicdetails", method = RequestMethod.GET)
	 
	 public List<OnlineExamTopic> getOnlineExamTopic() {
		return onlineExamTopicService.getOnlineExamTopic();
		 
	 }
	 
	 @PostMapping(value = "/savetopics", consumes = "application/json")
	  public void saveOnlineExamTopic(@RequestBody OnlineExamTopic topic) {
		 onlineExamTopicService.saveOnlineExamTopic(topic);
	 }
	 
	 @DeleteMapping(value = "/removetopics/{id}")
	  public void removeOnlineExamTopic(@PathVariable("id")int Id) {
		 onlineExamTopicService.removeOnlineExamTopic(Id);
	 }
	 
	

}
