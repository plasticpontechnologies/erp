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
@Table(name = "basic_info")
public class BasicInformation {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int slno;
	private String schoolName;
	private String schoolMoto;
	private Date softwareStartingDate;
	private String affiliatedBy;
	private int registrationNo;
	private int affliationNo;
	private Date dateOfEstablishment;
	private String board;

}