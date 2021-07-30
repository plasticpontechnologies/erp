package com.plasticon.erp.model;
import java.sql.Time;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="add_stop")
public class AddStop {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int stopId;
private String stoppage;
private Time sTime;
private String stopType;

}
