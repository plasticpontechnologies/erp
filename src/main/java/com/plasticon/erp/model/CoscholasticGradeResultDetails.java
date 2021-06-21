package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name ="CSGR_Details")
public class CoscholasticGradeResultDetails {

	@Id
	private int coscholasticGradeResultId;
	private String className;
	private String SCArea;
	private String studentName; 
}
