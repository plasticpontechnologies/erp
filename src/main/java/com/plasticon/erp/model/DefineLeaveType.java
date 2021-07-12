package com.plasticon.erp.model;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="define_leave_type")
public class DefineLeaveType {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int defineLeaveTypeId;
private String leaveName;
private String timeCircle;
private String type;
private Timestamp createdOn;

}
