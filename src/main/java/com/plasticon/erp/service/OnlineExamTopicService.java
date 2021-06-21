package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.OnlineExamTopic;
import com.plasticon.erp.repository.OnlineExamTopicRepository;


@Service
public class OnlineExamTopicService {
	@Autowired
	OnlineExamTopicRepository onlineExamTopicRepository;
		public List<OnlineExamTopic> getOnlineExamTopic() {
			return onlineExamTopicRepository.findAll();

		}
		public void saveOnlineExamTopic(OnlineExamTopic topic) {
			onlineExamTopicRepository.save(topic);
			
		}
		@Transactional
		public void removeOnlineExamTopic(int id) {
			onlineExamTopicRepository.deleteById(id);
		}

}
