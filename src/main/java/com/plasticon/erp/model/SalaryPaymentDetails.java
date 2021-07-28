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
@Table(name="salary_payment_details")
public class SalaryPaymentDetails {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int salaryPaymentDetailsId;
@OneToOne()
@JoinColumn(name="stafId")
private StaffDetails selectStaff;
@OneToOne()
@JoinColumn(name="paytyId")
private CreateAccountType paymentType;
private Date monthYear;
private Date paymentDate;
@OneToOne()
@JoinColumn(name="accId")
private CreateAccount account;
private String remarks;


}
