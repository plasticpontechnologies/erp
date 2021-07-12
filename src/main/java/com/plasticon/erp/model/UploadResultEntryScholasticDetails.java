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
@Table(name = "upload_res_details")
public class UploadResultEntryScholasticDetails {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int uresId;
	private String examType;
	private String className;
	private String subjectName;
	private int maxMarks;
	private Date dateOfExam;
	private Double admissionNumber;
}
