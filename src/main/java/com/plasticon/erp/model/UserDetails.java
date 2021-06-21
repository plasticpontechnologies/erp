package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Entity
@Data
@Table(name = "user_details")
public class UserDetails {
	@Id
	private int userId;
	private String userName;
	private String userPassword;
	private String userType;
	private String userActive;
	
	
	
	}
