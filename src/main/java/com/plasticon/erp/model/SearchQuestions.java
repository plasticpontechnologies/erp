package com.plasticon.erp.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="search_questions")
public class SearchQuestions {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private int slno;
	
	private String difficultyLevel;
	private String topic;
	private String bookName;
	private String typeOfQuestion;
	private String status;
	
	
}
