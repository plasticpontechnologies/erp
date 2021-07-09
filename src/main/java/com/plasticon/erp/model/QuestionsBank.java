package com.plasticon.erp.model;

import javax.persistence.Entity;
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
@Table(name="questions")
public class QuestionsBank {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private int QuestionId;

	private String question;
	private int marks;
	private String hint;
	private String solution_description;
	private String status;
	
	@OneToOne
	@JoinColumn(name="difId")
	private OnlineExamDifficultyLevel difficulty;
	
	
	@ManyToOne
	private Subjects subs;
	
	

	

}
