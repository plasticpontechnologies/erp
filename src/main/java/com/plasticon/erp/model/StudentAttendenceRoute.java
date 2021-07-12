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
@Table(name="student_attendence")
public class StudentAttendenceRoute {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int attendenceId;
private String route;
private Date attendenceOn;
private String orderBy;
}
