package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.Data;

@Entity
@Table(name = "difficulty_level")
@Data

public class OnlineExamDifficultyLevel {
	
	@Id
	private int slno;
	private String difficulty_level;

	
	
    
}
