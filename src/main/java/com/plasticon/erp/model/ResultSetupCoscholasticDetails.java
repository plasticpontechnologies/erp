package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name= "rscs_details")
public class ResultSetupCoscholasticDetails {

	@Id
	private int resultSetupCoscholasticId;
	private String coscAreaName;
	private String className;
	private  String coscTermName;
	private double admissionNumber;
	
}
