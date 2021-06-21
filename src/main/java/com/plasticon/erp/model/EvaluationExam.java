package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "exam_student_list")
public class EvaluationExam {
	@Id
	private int slno;
	private String Exam;


}
