package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="salary_head")
public class SalaryHead {
@Id
private int salaryHeadId;
private String salaryHead;


}
