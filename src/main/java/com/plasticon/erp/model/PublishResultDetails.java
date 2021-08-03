package com.plasticon.erp.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Entity
@Data
@Table(name= "publishResult_details")
public class PublishResultDetails {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int publishResultId;
//	private String examType;
//	private String className;
	private String marks;
//	private String subject;
	
	
	private String message;
	private String examResult;
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name= "et_fk")
	private ExamTypeDetails etd;

	
	@ManyToOne
	private SubjectDetails subs;
	
	
}
