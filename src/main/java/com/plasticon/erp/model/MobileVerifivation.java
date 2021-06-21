package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="verification")
public class MobileVerifivation {
	
	@Id
	private int slno;
	private String userRole;
	private int countryCode;
	private long mobileNumber;
	private long otp;
	
	
}
