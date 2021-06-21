package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Data
@Table(name = "biometric_device")
public class BiometricDevices {
	@Id
	private int bdId;
	private String deviceName;
	private String deviceSerialNumber;
	private String deviceModel;
	private String deviceStatus;
	private String deviceFor;

}
