package com.plasticon.erp.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Entity
@Data
@Table(name="subjects")
public class Subjects {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private int SubId;

	private String subjectName;
	
	
	 @ManyToOne
	 private classes clas;
	 
	 @JsonIgnore
	 @OneToMany(targetEntity = QuestionsBank.class)
	 private List<QuestionsBank> questions;
	 

}
