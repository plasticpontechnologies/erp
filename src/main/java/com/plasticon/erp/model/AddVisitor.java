package com.plasticon.erp.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="add_visitor")
public class AddVisitor {
@Id
private int addVisitorId;
private String purpose;
private String name;
private Long mobileNumber;
private int noOfPeople;
private Date inDate;
private String description;

}
