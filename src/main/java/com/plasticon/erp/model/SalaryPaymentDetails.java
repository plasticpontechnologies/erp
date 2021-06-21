package com.plasticon.erp.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="salary_payment_details")
public class SalaryPaymentDetails {
@Id
private int salaryPaymentDetailsId;
private String selectStaff;
private String paymentType;
private Date monthYear;
private Date paymentDate;
private String account;
private String remarks;


}
