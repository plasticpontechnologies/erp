package com.plasticon.erp.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "upload_res_details")
public class UploadResultEntryScholasticDetails {

	@Id
	private int uresId;
	private String examType;
	private String className;
	private String subjectName;
	private int maxMarks;
	private Date dateOfExam;
	private Double admissionNumber;
}
