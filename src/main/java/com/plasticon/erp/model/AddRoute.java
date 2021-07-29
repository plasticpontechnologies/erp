package com.plasticon.erp.model;

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
@Table(name="add_route")
public class AddRoute {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int routeId;
private String routeName;
@OneToOne()
@JoinColumn(name="vcleId")
private AddVehicle vehicleName;
@OneToOne()
@JoinColumn(name="toId")
private RouteTo toWhere;
@OneToOne()
@JoinColumn(name="drivId")
private StaffDetails driver;
private String remarks;


}
