package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name ="staffReview_Details")
public class StaffReviewDetails {
	
	@Id
	private int staffReviewId;
	private String staffName;
	

}
