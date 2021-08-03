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
@Table(name= "rscs_details")
public class ResultSetupCoscholasticDetails {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int resultSetupCoscholasticId;
//	private String coscAreaName;
//	private String className;
//	private  String coscTermName;
	private double admissionNumber;
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "csac_fk")
	private CoscholasticAreaCreateDetails csacd;
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "set_fk")
	private SetupExamTermsDetails setd;
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "cd_fk")
	private ClassDetails cd;
}
