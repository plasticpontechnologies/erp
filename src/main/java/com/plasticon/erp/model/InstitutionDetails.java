package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "institution_details")
public class InstitutionDetails {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int institutionId;
	private String certificateType;
	private String institutionName;
	private String address;
	private String email;
	private Long phone;
	private String website;
	private String logoPosition;
	private String certificateName;
	private String certicateSerialNumber;

}
