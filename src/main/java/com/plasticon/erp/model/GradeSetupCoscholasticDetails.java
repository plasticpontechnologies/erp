package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "GSUCS_Details")
public class GradeSetupCoscholasticDetails {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int gradeSetupCoscholasticId;
	private String studentList;
	private String Grade;
}
