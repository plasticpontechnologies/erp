package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="smsstaff_details")
public class SendSmsToStaff {

	@Id
	private int staffId;
	private String selectStaff;
	private String sendMessageUsing;
	private int number;
	private String language;
	private String messageContent;
	
}
