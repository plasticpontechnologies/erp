package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Data
@Table(name = "login_report")
public class LoginReport {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int lrId;
	private String viewReport;

}
