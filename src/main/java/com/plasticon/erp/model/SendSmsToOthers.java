package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="others_details")
public class SendSmsToOthers {
	
	@Id
	private int oId;
	private long mobilenumber;
	private long wthcmobileNumber;
	private String language;
	private String messageContent;
	
	
	
}
