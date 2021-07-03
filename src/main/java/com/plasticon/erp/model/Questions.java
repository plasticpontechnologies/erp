package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="questions_details")
public class Questions {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int qId;
	private String selectQuestionsOptions;
	private String Questions;
}
