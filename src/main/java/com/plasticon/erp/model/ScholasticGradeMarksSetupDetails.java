package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name ="SGMS_Details")
public class ScholasticGradeMarksSetupDetails {
	
	@Id
	private int sgmsId;
	private int maximumMarks;
	private String grade;
	private int maximum;
	private int minimum;
	private String result;
	

}
