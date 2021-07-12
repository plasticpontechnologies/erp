package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="contact_info")
public class ContactInfo {

	@Id
	private int slno;
	private String country;
	private String state;
	private String city;
	private String district;
	private String address;
	private long pin;
	private String email;
	private long mobile;
	private long alternateMobile;
	private long landLine;
	private int fax;
	private String schoolLocation;
}
