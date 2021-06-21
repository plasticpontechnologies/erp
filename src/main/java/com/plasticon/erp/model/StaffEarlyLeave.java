package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Data
@Table(name = "staff_early_leave")
public class StaffEarlyLeave {
	@Id
	private int selId;
	private String monthYear;

}
