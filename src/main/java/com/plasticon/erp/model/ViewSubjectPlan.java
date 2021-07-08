package com.plasticon.erp.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Data
@Table(name = " view_subject_plan")
public class ViewSubjectPlan {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int vspId;
	private String selectClass;
	private Date selectDate;

}
