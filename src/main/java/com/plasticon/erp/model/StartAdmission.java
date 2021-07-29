package com.plasticon.erp.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Data
@Table(name = "start_admission")
public class StartAdmission {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int saId;
	private String admissionStatus;
	@OneToOne()
	@JoinColumn(name="sesId")
	private Session selectSession;
	private Date admissionStartDate;
	private Date admissionEndDate;

}
