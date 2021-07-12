package com.plasticon.erp.model;

import java.sql.Time;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "examtype")
public class ExamTypeDetails {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int examTypeId;
	private String examTypeName;
	private Time examDuration;
	private String remarks;
	private String examStatus;

}
