package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="add_route")
public class AddRoute {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int routeId;
private String routeName;
private String vehicleName;
private String toWhere;
private String driver;
private String remarks;


}
