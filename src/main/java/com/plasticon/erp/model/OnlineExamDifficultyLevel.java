package com.plasticon.erp.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


import lombok.Data;

@Entity
@Table(name = "difficulty_level")
@Data

public class OnlineExamDifficultyLevel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private int slno;
	private String difficulty_level;
	
	@OneToMany
	
	private List<CreateOnlineExamInfo> examinfo;
	

	

	
	
    
}