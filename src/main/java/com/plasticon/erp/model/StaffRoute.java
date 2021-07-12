package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="staff_route")
public class StaffRoute {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int staffRouteId;
private String stoppage;
private String staff;

}
