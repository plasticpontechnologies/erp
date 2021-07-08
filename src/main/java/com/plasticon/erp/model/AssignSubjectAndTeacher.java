package com.plasticon.erp.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Data
@Table(name = "assign_subject_teacher")
public class AssignSubjectAndTeacher {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int astId;
	private String className;
	private Date fromDate;
	private Date toDate;

}
