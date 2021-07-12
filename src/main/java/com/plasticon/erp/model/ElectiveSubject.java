package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="elective_subject")
public class ElectiveSubject {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int eId;
	private String selectClass;
	private String student;
	
}
