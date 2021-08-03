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
@Table(name= "VMS_Details")
public class ViewMarkSheetDetails {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int viewMarkSheetId;
	private String className;
	private String studentName;
	private String pageLayout;
	private String paperSize;
	private String subjectName;
	private String remark1;
	private String remark2;
//	private String termsOptional;
	private int optionalInPx;
	private int percentage;
	private String customizeMarkSheet;
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "setd_fk")
	private SetupExamTermsDetails setd;
}
