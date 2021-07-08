package com.plasticon.erp.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "student_upload")
public class StudentUpload {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int studentId;
	private int rowNumber;
	private String studentName;
	private String status;
	private Date createdOn;

}