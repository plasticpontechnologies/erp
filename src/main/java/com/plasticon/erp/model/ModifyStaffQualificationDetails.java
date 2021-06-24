package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "msq_details")
public class ModifyStaffQualificationDetails {

	@Id
	private int msqId;
	private String boardOrUniversity;
	private String year;
	private String remarks;
	private String className;
	private String marks;
}
