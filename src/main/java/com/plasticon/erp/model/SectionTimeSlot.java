package com.plasticon.erp.model;

import java.sql.Time;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Data
@Table(name = "section_time_slot")
public class SectionTimeSlot {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int stsId;
	private String className;
	private String day;
	private Time sectionStartTime;
	private Time sectionEndTime;
	private String asHoliday;

}
