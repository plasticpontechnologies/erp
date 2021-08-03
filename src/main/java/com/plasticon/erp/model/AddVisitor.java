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
@Table(name="add_visitor")
public class AddVisitor {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int addVisitorId;
@OneToOne
@JoinColumn(name="purposeId")
private Purpose purpose;
private String name;
private String mobileNumber;
private int noOfPeople;
private Date inDate;
private String description;

}
