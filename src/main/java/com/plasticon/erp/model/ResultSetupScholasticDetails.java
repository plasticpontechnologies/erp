package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name= "RSS_details")
public class ResultSetupScholasticDetails {
   
	@Id
	private int resultSetupScholasticId;
	private String examType;
	private String className;
	private String subjectName;
	private Double admissionNumber;
	private String remarks;
}
