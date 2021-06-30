package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="staff_mail_details")
public class StaffLoginDetails {

	@Id
	private int staffId;
	private String selectStaff;
	private String sendMessageUsing;
	private String shareLoginLink;
	private int selectNumber;
	private String language;
	private String fixedContent;
	private String messageContent;
	
}
