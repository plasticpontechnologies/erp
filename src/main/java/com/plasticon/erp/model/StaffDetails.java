package com.plasticon.erp.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "staff_details")
public class StaffDetails {
	@Id
	private String fullName;
	private String parentName;
	private Date dateOfBirth;
	private String gender;
	private Long mobileNumber;
	private String email;
	private String address;
	private int experience;
	private String subject;
	private String qualification;

}
