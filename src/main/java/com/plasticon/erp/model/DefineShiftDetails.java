package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "defineshift_details")
public class DefineShiftDetails {
    
	@Id
	private int defineShiftId;
	private String defineShiftName;
}
