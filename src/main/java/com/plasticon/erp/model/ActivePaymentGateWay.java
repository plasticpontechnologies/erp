package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="active_payment_gateway")
public class ActivePaymentGateWay {
	@Id
	private int activePaymentGateWayId;
	private String activePaymentGateWay;
}
