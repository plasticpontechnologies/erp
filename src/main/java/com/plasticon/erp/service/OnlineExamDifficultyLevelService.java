package com.plasticon.erp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.plasticon.erp.repository.OnlineExamDifficultyLevelRepository;

import com.plasticon.erp.model.OnlineExamDifficultyLevel;


@Service
public class OnlineExamDifficultyLevelService {
	

	@Autowired
	OnlineExamDifficultyLevelRepository onlineExamDifficultyLevelRepository;
	public List<OnlineExamDifficultyLevel> getOnlineExamDifficultyLevel() {
		return onlineExamDifficultyLevelRepository.findAll();

	}
	
	public void saveOnlineExamDifficultyLevel(OnlineExamDifficultyLevel difficultyLevel) {
		onlineExamDifficultyLevelRepository.save(difficultyLevel);
	}
}

