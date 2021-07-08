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
@Table(name = "view_students")
public class ViewStudents {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int studentsId;
	private String studentName;
	private String admissionNumber;
	private String fatherName;
	private long mobile;
	private String classRegistered;
	private Date dateOfRegistration;
	private String studentDeviceId;
	

}
