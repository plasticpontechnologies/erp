package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "scr_details")
public class ScholasticGradeResultDetails {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int scholasticGradeResultId;
	private String className;
	private String examType;
	private String subjectName;
	private String studentName;
	

}
