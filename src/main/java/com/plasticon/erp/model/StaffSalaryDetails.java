package com.plasticon.erp.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name ="staffSalary_Details")
public class StaffSalaryDetails {
	
	@Id
	private int staffId;
	private String StaffName;
	private Date salaryStartDate;
	private Date salaryEndDate;

}
