package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="leave_structure")
public class LeaveStructure {
@Id
private int leaveStructureId;
private int everyMonth;
private int everyQuarter;
private int yearly;
private int maternity;
private int festival;
}
