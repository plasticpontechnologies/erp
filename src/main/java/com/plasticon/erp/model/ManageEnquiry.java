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
@Table(name="manage_enquiry")
public class ManageEnquiry {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int manageEnquiryId;
@OneToOne
@JoinColumn(name="enquirymId")
private EnquiryType enquiryType;
@OneToOne
@JoinColumn(name="referencemId")
private Reference reference;
@OneToOne
@JoinColumn(name="responsemId")
private Response response;
private String name;
private String address;
private String mobileNumber;
private String alternateMobile;
private Date dateOfEnquiry;
private int noOfChild;
}
