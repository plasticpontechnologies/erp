package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.CreateOnlineExamInfo;
import com.plasticon.erp.repository.CreateOnlineExamInfoRepository;



@Service
public class CreateOnlineExamInfoService {
	
	@Autowired
	CreateOnlineExamInfoRepository createOnlineExamInfoRepository;
	public List<CreateOnlineExamInfo> getCreateOnlineExamInfo() {
		return createOnlineExamInfoRepository.findAll();
	}
	
	public void saveCreateOnlineExamInfo(CreateOnlineExamInfo examinfo) {
		createOnlineExamInfoRepository.save(examinfo);
	}
	
	@Transactional
	public void removeCreateOnlineExam(int id) {
		createOnlineExamInfoRepository.deleteById(id);
	}
	
	public List<CreateOnlineExamInfo> findBySubs(int subsId) {
		return createOnlineExamInfoRepository.findBySubs(subsId);
	}

}
