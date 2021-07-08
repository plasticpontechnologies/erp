package com.plasticon.erp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.plasticon.erp.model.OnlineExamDifficultyLevel;
import com.plasticon.erp.service.OnlineExamDifficultyLevelService;


@RestController
@RequestMapping("/OnlineExam")
public class OnlineExamDifficultyLevelControlller {
	
	@Autowired
	OnlineExamDifficultyLevelService onlineExamDifficultyLevelService;
	
	@RequestMapping(value = "/getdifficultylevel", method = RequestMethod.GET)
	public List<OnlineExamDifficultyLevel>  getOnlineExamDifficultyLevel() {
		return onlineExamDifficultyLevelService.getOnlineExamDifficultyLevel();

	}
	
	@PostMapping(value="/savediffivultlevel", consumes="application/json")
	public void saveOnlineExamDifficultyLevel(OnlineExamDifficultyLevel difflev) {
		onlineExamDifficultyLevelService.saveOnlineExamDifficultyLevel(difflev);
	}

}
