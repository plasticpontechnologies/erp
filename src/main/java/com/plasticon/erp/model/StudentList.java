package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data

@Table(name = "student_list")

public class StudentList {
	@Id
	private int slId;
	private String selectSession;

	private String classes;

	
	

}
