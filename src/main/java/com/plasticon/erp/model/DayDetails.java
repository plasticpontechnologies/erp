package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name= "day_details")
public class DayDetails {
	@Id
	private int dayId;
	private String dayName;

}
