package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Data
@Table(name = "view_admission_request")
public class ViewAdmissionRequest {
	@Id
	private int ssId;
	private String selectSessions;

}
