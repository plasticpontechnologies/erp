package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "stu_gender")
public class Gender {
	
	@Id
	private int gid;
	private String gender;

}
