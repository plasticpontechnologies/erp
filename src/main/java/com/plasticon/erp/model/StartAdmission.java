package com.plasticon.erp.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Data
@Table(name = "start_admission")
public class StartAdmission {
	@Id
	private int saId;
	private String admissionStatus;
	private String selectSession;
	private Date admissionStartDate;
	private Date admissionEndDate;

}
