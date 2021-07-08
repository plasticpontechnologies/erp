package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="evaluate_result")
public class EvaluateExamResult {
	 @Id
	 @GeneratedValue(strategy=GenerationType.AUTO)
	    private int slno;
	    private String onlineExam;
	    private String classes;
	    private String Student;



}
