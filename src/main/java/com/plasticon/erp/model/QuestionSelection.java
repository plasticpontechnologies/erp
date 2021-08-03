package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="q_selection")
public class QuestionSelection {
	
	@Id
	private int qSelId;
	private int numOfQues;
	private String automatically;
	private String manual;
	private String addMoreQuestions;
	private int equalMarks;
	private int differentMarks;
	
	
}
