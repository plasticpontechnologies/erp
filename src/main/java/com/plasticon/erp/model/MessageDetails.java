package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="messagetype_details")
public class MessageDetails {
	@Id
	private int mId;
	private String shareLoginLink;
	private String sendMessageUsing;
	private int mnumber;
	private String language;
	private String fixedContent;
	private String messageContent;
}
