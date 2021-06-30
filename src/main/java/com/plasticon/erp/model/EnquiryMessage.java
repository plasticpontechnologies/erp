package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.Data;

@Entity
@Data
@Table(name = "enquirymessagedetails")
public class EnquiryMessage {
	
	@Id
	private int enqId;
	private int selectNumber;
	private String language;
	private String messageContent;
	
}
