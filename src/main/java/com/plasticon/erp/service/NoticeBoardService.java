package com.plasticon.erp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.erp.model.MessSchedule;
import com.plasticon.erp.model.NoticeBoard;
import com.plasticon.erp.repository.NoticeBoardRepository;

@Service
public class NoticeBoardService {

	@Autowired
	NoticeBoardRepository noticeboardRepository;
	
	public List<NoticeBoard> getNoticeBoard() {
		return noticeboardRepository.findAll();

	}

	public void saveNoticeBoard(NoticeBoard notice) {
		noticeboardRepository.save(notice);
		

	}
	@Transactional
	public void removeNoticeBoard(int id) {
		noticeboardRepository.deleteById(id);
	}

}
