package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="library_setting")
public class LibrarySetting {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int lId;
	private String forStaff;
	private String reissueTimes;
	private String forStudent;
	private String reissueTimesType;
	// private String referenceBookAllowedToBeIssued;
	
	
	
}
