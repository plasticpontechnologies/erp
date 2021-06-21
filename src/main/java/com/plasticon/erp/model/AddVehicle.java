package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="add_vehicle")
public class AddVehicle {
@Id
private int addVehicleId;
private String vehicleName;
private String vehicleNumber;
private Long vehicleDeviceId;
}
