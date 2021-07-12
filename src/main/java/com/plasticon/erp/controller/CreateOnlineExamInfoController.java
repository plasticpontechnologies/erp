package com.plasticon.erp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.plasticon.erp.model.CreateOnlineExamInfo;
import com.plasticon.erp.model.SubjectDetails;
import com.plasticon.erp.service.CreateOnlineExamInfoService;

@RestController
@RequestMapping("/cronlineexam")
public class CreateOnlineExamInfoController {
	
	@Autowired
	CreateOnlineExamInfoService createOnlineExamInfoService;
	
	@RequestMapping(value = "/getexaminfo", method =RequestMethod.GET)
	public List<CreateOnlineExamInfo>  getCreateOnlineExamInfo() {
		return createOnlineExamInfoService.getCreateOnlineExamInfo();
	}
	
	@PostMapping(value = "/savecreateOnlineExamInfo", consumes = "application/json")
	public void saveCreateOnlineExamInfo(@RequestBody CreateOnlineExamInfo crexaminfo) {
		createOnlineExamInfoService.saveCreateOnlineExamInfo(crexaminfo);
	}
	
	@DeleteMapping(value="/removecreateOnlineExamInfo/{id}")
	public void removeCreateOnlineExamInfo(@PathVariable("id")int Id) {
		createOnlineExamInfoService.removeCreateOnlineExam(Id);
	}
	
	@GetMapping(value="/getexaminfobyid/{subsId}")
	public List<CreateOnlineExamInfo> getCreateOnlineExamInfo(@PathVariable("subsId")int subsId) {
		return createOnlineExamInfoService.findBySubs(subsId);
	}

}
