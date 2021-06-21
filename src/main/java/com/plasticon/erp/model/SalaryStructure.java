package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="salary_structure")
public class SalaryStructure {
@Id
private int salaryStructureId;
private String templateName;
private String fixedSalaryHead;

}
