package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Data
@Table(name = "homework_evaluation_report")
public class HomeworkEvaluationReport {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int hId;
	private String selectStudent;
	private String selectClass;
	

}