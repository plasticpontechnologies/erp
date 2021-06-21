package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="manage_user_permission")
public class UserPermissionUserType {
	
	@Id
	private int slno;
	private String userType;
	private String status;

}