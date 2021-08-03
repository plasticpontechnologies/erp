package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name ="CSGR_Details")
public class CoscholasticGradeResultDetails {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int coscholasticGradeResultId;
	private String className;
	
	private String studentName; 
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "csac_fk")
	private CoscholasticAreaCreateDetails csacd;
}
