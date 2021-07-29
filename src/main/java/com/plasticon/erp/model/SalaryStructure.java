package com.plasticon.erp.model;

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
@Table(name="salary_structure")
public class SalaryStructure {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int salaryStructureId;
private String templateName;
@OneToOne()
@JoinColumn(name="salhdID")
private SalaryHeadDetails fixedSalaryHead;

}
