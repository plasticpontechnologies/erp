package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="message_details")
public class Message {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int mId;
	private String sendMessageUsing;
	private int menumber;
	private String language;
	private String messageContent;
	
	}
