package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "msq_details")
public class ModifyStaffQualificationDetails {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int msqId;
	private String boardOrUniversity;
	private String year;
	private String remarks;
	private String className;
	private String marks;
}
