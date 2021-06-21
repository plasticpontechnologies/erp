package com.plasticon.erp.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "setup_exam_terms")
public class SetupExamTermsDetails {
	
	@Id
	private int examTermId;
	private String term;
	private Double percentage;
	private String examType;
	

}
