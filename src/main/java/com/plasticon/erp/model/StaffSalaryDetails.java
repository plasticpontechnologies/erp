package com.plasticon.erp.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name ="staffSalary_Details")
public class StaffSalaryDetails {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int staffId;
//	private String StaffName;
	private Date salaryStartDate;
	private Date salaryEndDate;

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "sd_fk")
	private StaffDetails sd;
}
