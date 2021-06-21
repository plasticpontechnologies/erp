package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Data
@Table(name = "view_admission_report")
public class StudentViewAdmission {
	@Id
	private int svaId;
	private String selectSession;

}
