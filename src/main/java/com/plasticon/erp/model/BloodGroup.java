package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "blood_group")
public class BloodGroup {
	
	@Id
	private int bgId;
	private String bloodGroup;
	

}
