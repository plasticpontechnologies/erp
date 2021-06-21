package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="define_leave_coordinator")
public class DefineLeaveCoordinator {
@Id
private int defineLeaveCoordinatorId;
private String leaveCoordinator;


}
