package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="birthdays_list")
public class Birthdays {
	
	@Id
	private int bId;
	private String duration;
	private String durationType;
	
	
}
