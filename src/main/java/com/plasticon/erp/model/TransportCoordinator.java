package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="tansport_coordinator")
public class TransportCoordinator {
@Id
private int coordinatorId;
private String transportCoordinator;
}
