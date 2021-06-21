package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="salary_head_details")
public class SalaryHeadDetails {
@Id
private int headDetailsId;
private String type;
private String salaryHead;
private int code;

}
