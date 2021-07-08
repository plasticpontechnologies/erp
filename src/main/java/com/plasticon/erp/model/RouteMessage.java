package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="rm_details")
public class RouteMessage {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int rmId;
	private int selectNumber;
	private String sendMessageUsing;
	private String language;
	private String messageContent;
	
}
