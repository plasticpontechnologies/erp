package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "caste_details")
public class Caste {
	
	@Id
	private int cId;
	private String caste;

}
