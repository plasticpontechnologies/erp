package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "defineshift_details")
public class DefineShiftDetails {
    
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int defineShiftId;
	private String defineShiftName;
}
