package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "GSUCS_Details")
public class GradeSetupCoscholasticDetails {

	@Id
	private int gradeSetupCoscholasticId;
	private String studentList;
	private String Grade;
}
