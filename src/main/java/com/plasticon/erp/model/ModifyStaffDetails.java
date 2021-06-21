package com.plasticon.erp.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "modifystaff_details")
public class ModifyStaffDetails {

	
	@Id
	private int modifyStaffId;
	private String name;
	private int mobileNumber;
	private Date joinDate;
	private String position;
	private int alterNumber;
	private Date birthDate;
	private String email;
	private String presentAddress;
	private String permanentAddress;
	private String fatherName;
	private String motherName;
	private String status;
	private String Department;
	private String userType;
	private String userName;
	private String gender;
	private String staffProfile;
}
