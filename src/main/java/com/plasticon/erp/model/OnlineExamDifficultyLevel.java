package com.plasticon.erp.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "difficulty_level")
@Data

public class OnlineExamDifficultyLevel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private int slno;
	@Column(unique = true)
	private String difficulty_level;
	
	
	

	

	
	
    
}
