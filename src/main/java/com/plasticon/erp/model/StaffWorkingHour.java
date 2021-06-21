package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Data
@Table(name = "staff_working_hour")
public class StaffWorkingHour {
	@Id
	private int swhId;
	private String monthYear;

}
