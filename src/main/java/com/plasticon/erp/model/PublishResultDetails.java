package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name= "publishResult_details")
public class PublishResultDetails {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int publishResultId;
	private String examType;
	private String className;
	private String marks;
	private String subject;
	private String message;
	private String examResult;

}
