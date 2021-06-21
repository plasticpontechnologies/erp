package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="salary_payment")
public class SalaryPayment {
@Id
private int salaryPaymentId;
private String salaryPayment;

}
