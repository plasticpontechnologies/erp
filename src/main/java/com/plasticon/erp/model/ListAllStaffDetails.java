package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "list_allstaff")
public class ListAllStaffDetails {
    
	@Id 
	private int listAllStaffId;
	private String viewStaff;
}
