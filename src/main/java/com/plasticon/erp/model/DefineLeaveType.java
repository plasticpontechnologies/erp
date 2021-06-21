package com.plasticon.erp.model;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="define_leave_type")
public class DefineLeaveType {
@Id
private int defineLeaveTypeId;
private String timeCircle;
private String type;
private Timestamp createdOn;

}
