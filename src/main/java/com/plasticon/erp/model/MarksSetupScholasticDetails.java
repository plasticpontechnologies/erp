package com.plasticon.erp.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "msus_details")
public class MarksSetupScholasticDetails {
	
	@Id
	private int marksSetupScholasticId;
	private int maxMarks;
	private Date dateOfExam;

}
