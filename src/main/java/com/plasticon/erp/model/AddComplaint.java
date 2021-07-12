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
@Table(name="add_complaint")
public class AddComplaint {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int addComplaintId;
private String complaintType;
private String description;
private String action;
private Long mobileNumber;
private Date dateOfComplaint;

}
