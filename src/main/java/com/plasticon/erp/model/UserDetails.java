package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Table(name = "user_details")
@Data
public class UserDetails {
	@Id
	private int userId;
	private String userName;
	private String userPassword;
	private String userType;
	private String userActive;
	
	}
