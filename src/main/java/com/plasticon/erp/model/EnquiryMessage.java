package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int enqId;
	private int selectNumber;
	private String language;
	private String messageContent;
	
}
