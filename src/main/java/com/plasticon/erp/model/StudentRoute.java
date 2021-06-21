package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="student_route")
public class StudentRoute {
@Id
private int studentRouteId;
private String stoppage;
private String student;
}
