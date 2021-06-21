package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "view_syllabus")
public class ViewSyllabus {
	
	@Id
	private int csId;
	private String classes;
	private String subject;


}
