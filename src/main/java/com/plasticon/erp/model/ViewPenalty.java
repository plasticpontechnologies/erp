package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Data
@Table(name = "view_penalty")
public class ViewPenalty {
	@Id
	private int viewId;
	private String selectStudent;
	private String penaltyType;
	private String status;

}
