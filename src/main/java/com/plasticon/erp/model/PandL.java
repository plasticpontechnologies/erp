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
@Table(name="p_and_l")
public class PandL {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int id;
private Date fromDate;
private Date toDate;

}
