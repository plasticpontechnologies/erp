package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="global_settings")
public class GlobalSettings {
	
	@Id
	private int slno;
	private String currencyIcon;
	private String allowProfileUpdate;
	private String selfRegistrationAllow;
	private String print;
	private String mediaStorageUrl;
	private String homeWorkEditBy;
	private String homeWorksubDate;
	private String examsCanbeEntrdBy;
	private String feeFrqncyMntly;
	private String trsprtFeeDisbld;
	private String receiptIncrement;
	private String feepartialpay;
	private String gstEnable;
	private long gstNumber;
	private double gstPercent;
	private String chgsAlwdByAdmin;
	private String crntDateAlwd;

}
