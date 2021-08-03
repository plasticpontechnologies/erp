package com.plasticon.erp.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.data.annotation.CreatedDate;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Entity
@Data
@Table(name="student_route")
public class StudentRoute {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int studentRouteId;
@OneToOne
@JoinColumn(name="stpId")
private RouteDetails stoppage;
@OneToOne
@JoinColumn(name="studentId")
private StudentAdmission student;
@JsonIgnore
@CreatedDate
@Column
private Date lastUpdated;
}
