package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Data
@Table(name = "penalty_rules")
public class PenaltyRules {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int prId;
	private String ruleFor;
	private String penaltyCalculated;
	private String penaltyCalculationType;
	@OneToOne()
	@JoinColumn(name="penaltyId")
	private PenaltyMasterEntry penaltytype;
	private String chargesType;
	private int amountAndPercentage;

}
