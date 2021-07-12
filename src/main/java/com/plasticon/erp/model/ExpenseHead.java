package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="exense_head")
public class ExpenseHead {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int expenseHeadId;
private String expenseHead;

}
