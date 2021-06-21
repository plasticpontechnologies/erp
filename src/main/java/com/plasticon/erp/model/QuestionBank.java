package com.plasticon.erp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "question_bank")
public class QuestionBank {
	
	@Id
	private int slno;
	private String Question;
	private String Marks;
	private String Hint;
	@Column (name = "SOLUTION_DESCRIPTION", length=2000)
	private String Solution_description;
	private String Status;

}
