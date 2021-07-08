package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "blood_group")
public class BloodGroup {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int bgId;
	private String bloodGroup;
	

}
