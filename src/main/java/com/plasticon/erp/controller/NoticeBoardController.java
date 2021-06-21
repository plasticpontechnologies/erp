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

import com.plasticon.erp.model.Message;
import com.plasticon.erp.model.NoticeBoard;
import com.plasticon.erp.service.NoticeBoardService;

@RestController
@RequestMapping("/notice")
public class NoticeBoardController {

	@Autowired
	NoticeBoardService noticeboardService;
	
	@RequestMapping(value = "/getNoticeBoard", method = RequestMethod.GET)
	public List<NoticeBoard>  getNoticeBoardData() {
		return noticeboardService.getNoticeBoard();

	}
	
	  @PostMapping(value = "/saveNoticeBoard", consumes = "application/json")
		public void saveMessage(@RequestBody NoticeBoard notice) {
		  noticeboardService.saveNoticeBoard(notice);

		}
		

		  @DeleteMapping(value ="/removeMessage/{id}")
		    public void removeMessage(@PathVariable("id")int Id){
			  noticeboardService.removeNoticeBoard(Id);
		    }


	
}
