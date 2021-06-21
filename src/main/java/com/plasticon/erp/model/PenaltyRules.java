package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Data
@Table(name = "penalty_rules")
public class PenaltyRules {
	@Id
	private int prId;
	private String ruleFor;
	private String penaltyCalculated;
	private String penaltyCalculationType;
	private String penaltytype;
	private String chargesType;
	private int amountAndPercentage;

}
