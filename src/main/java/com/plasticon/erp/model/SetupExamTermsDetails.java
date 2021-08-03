package com.plasticon.erp.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "setup_exam_terms")
public class SetupExamTermsDetails {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int examTermId;
	private String term;
	private Double percentage;
//	private String examType;
	

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name ="et_fk")
	private ExamTypeDetails etd;
}
