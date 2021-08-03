package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name= "RSS_details")
public class ResultSetupScholasticDetails {
   
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int rssId;
//	private String examType;
//	private String className;
//	private String subjectName;
//	private Double admissionNumber;
	private String remarks;
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "et_fk")
	private ExamTypeDetails etd;
	

	@ManyToOne
	private SubjectDetails subs;
	
	@ManyToOne
	private StudentAdmission sa;
}
