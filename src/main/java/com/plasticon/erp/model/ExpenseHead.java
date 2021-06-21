package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="exense_head")
public class ExpenseHead {
@Id
private int expenseHeadId;
private String expenseHead;

}
