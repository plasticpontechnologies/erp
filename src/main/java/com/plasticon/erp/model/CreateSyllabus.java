package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "create_syllabus")
public class CreateSyllabus {
	
	@Id
	private int csId;
	private String classes;
	private String subject;

}
