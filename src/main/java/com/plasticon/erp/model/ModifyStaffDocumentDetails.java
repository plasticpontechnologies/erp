package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "msd_details")
public class ModifyStaffDocumentDetails {

	@Id
	private int msdId;
	private String title;
	private String documentName;
	private String chooseDocument;
}
