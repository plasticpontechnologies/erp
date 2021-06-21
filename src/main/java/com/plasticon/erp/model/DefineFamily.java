package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "define_family")
public class DefineFamily {

	@Id
	private int dfId;
	private String familyName;
	private String selectStudent;
	
	
}
