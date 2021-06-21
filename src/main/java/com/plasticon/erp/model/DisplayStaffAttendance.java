package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Data
@Table(name = "display_staff_attendance")
public class DisplayStaffAttendance {
	@Id
	private int dsaId;
	private String monthYear;

}
