package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="staff_mail_details")
public class StaffLoginDetails {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int staffId;
	private String selectStaff;
	private String sendMessageUsing;
	private String shareLoginLink;
	private int selectNumber;
	private String language;
	private String fixedContent;
	private String messageContent;
	
}
