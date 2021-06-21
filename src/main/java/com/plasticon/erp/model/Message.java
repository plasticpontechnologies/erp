package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="message_details")
public class Message {
	
	@Id
	private int mId;
	private String sendMessageUsing;
	private int menumber;
	private String language;
	private String messageContent;
	
	}
