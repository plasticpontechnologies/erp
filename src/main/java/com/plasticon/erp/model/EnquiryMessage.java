package com.plasticon.erp.model;

import javax.persistence.Id;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/enquirymessage")
public class EnquiryMessage {
	
	@Id
	private int enqId;
	private int number;
	private String language;
	private String messageContent;
	
}
