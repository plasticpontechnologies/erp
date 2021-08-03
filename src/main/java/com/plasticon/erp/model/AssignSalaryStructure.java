package com.plasticon.erp.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="assign_salary_structure")
public class AssignSalaryStructure {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private int assignSalaryId;
	@OneToOne()
	@JoinColumn(name="stafId")
	private StaffDetails selectStaff;
	@OneToOne()
	@JoinColumn(name="salstId")
	private SalaryStructure salaryTemplates;
	private String remarks; 	
	private Date monthEffectiveFrom;

	
	
 
}
