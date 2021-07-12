package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="institute_details")
public class SetInstituteDetails {
	
	@Id
	private int slno;
	private String instituteType;
	private String instituteName;

}
