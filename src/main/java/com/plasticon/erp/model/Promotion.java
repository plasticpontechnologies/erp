package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "student_promotion")
public class Promotion {

	@Id
	private int spId;
	private String fromSession;
	private String toSession;
	private String fromClass;
	private String toClass;
	
	
}
