package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="birthdays_list")
public class Birthdays {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int bId;
	private String duration;
	private String durationType;
	
	
}
