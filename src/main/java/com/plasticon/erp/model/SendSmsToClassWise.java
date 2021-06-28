package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="classwise_details")
public class SendSmsToClassWise {
	
	@Id
	private int clId;
	private String smsclass;
	
}
