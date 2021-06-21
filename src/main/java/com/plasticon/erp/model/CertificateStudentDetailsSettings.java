package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Data
@Table(name = "certificate_student_settings")
public class CertificateStudentDetailsSettings {
	@Id
	private int csdsId;
	private String certificateType;
	private String fieldLabel;
	private String valueCriteria;
	

}
