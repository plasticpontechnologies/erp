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
@Table(name="add_reading")
public class AddReading {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int readingId;
@OneToOne()
@JoinColumn(name="vcleId")
private AddVehicle vehicleName;
private int reading;
private Date readingDate;
private String remarks;

}
