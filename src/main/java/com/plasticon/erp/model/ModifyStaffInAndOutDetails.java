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
@Table(name = "msiao_details")
public class ModifyStaffInAndOutDetails {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int msiaoId;
	private String day;
	private String shiftName;
	private Time inTime;
	private Time outTime;
}
