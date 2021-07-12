package com.plasticon.erp.model;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="student_arrival_departure")
public class StudentArrivalDeparture {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int arrivalDepartureId;
private String student;
private String type;
private Date adDate;
private Time adTime;
private String description;

}
