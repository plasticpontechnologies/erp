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
@Table(name="add_reading")
public class AddReading {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int readingId;
private String vehicleName;
private int reading;
private Date readingDate;
private String remarks;

}
