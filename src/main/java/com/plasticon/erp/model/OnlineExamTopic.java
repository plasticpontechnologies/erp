package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "topic_details")
@Data
public class OnlineExamTopic {
	
	@Id
	private int slno;
	private String topic;
	private String description;
	private String subject;
	private int numOfPeriods;
	
	

}
