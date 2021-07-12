package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="add_vehicle")
public class AddVehicle {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int addVehicleId;
private String vehicleName;
private String vehicleNumber;
private Long vehicleDeviceId;
}
