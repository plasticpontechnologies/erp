package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="survey_information")
public class SurveyInformation {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int suId;
	private String surveyFor;
	private String typeOfQuestion;
	private String SurveyName;
	
	
}
