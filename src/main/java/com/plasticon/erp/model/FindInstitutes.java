package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="organizations")
public class FindInstitutes {
	
	@Id
	private int slno;
	private String instituteNames;
	

}
