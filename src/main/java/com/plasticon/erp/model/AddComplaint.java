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
@Table(name="add_complaint")
public class AddComplaint {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int addComplaintId;
@OneToOne
@JoinColumn(name="complId")
private ComplaintType complaintType;
private String description;
private String action;
private String mobileNumber;
private Date dateOfComplaint;

}
