package com.plasticon.erp.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="print_payslip")
public class PrintPayslip {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int printPayslipId;
private Date monthYear;
private String selectStaff;
}
