package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Data
@Table(name = "display_staff_attendance")
public class DisplayStaffAttendance {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int dsaId;
	private String monthYear;

}
