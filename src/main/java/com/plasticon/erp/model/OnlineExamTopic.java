package com.plasticon.erp.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "topic_details")
@Data
public class OnlineExamTopic {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int slno;
	private String topic;
	private String description;
	private int numOfPeriods;

	

}
