package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="survey_report")
public class SurveyReport {
	
	@Id
	private int suId;
	private String survey;
}
