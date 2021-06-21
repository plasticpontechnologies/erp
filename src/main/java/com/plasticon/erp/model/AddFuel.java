package com.plasticon.erp.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="add_fuel")
public class AddFuel {
@Id
private int fuelId;
private String vehicleName;
private int fuelQuantity;
private int ratePerLitre;
private Date fuelDate;
private int recieptNo;
private String remarks;
}
