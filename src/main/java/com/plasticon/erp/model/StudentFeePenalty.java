package com.plasticon.erp.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Data
@Table(name = "student_fee_penalty")

public class StudentFeePenalty {
	@Id
	private int sfpId;
	private String selectStudent;
	private Date selectDate;

}
