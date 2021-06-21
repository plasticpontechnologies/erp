package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="route_to")
public class RouteTo {
@Id
private int routeId;
private String routeTo;
private String status;
}
