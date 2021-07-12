package com.plasticon.erp.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="session_details")
public class Session {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int sessionId;
private Date sessionStartDate;
private Date sessionEndDate;

}
