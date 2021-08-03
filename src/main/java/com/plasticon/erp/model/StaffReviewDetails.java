package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name ="staffReview_Details")
public class StaffReviewDetails {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int staffReviewId;
//	private String staffName;
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "sd_fk")
	private StaffDetails sd;

}
