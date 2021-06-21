package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name= "user_type")
public class UserType {
	@Id
	private int userId;
	private String staffUserType;

}
