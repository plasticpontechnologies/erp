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
@Table(name="manage_enquiry")
public class ManageEnquiry {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int manageEnquiryId;
private String enquiryType;
private String reference;
private String response;
private String name;
private String address;
private Long mobileNumber;
private Long alternateMobile;
private Date dateOfEnquiry;
private int noOfChild;
}
