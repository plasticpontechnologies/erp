package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Data
@Table(name = "call_type")
public class CallType {
	@Id
	private int ctId;
	private String callType;

}
