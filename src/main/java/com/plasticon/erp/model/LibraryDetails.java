package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "e_library")
public class LibraryDetails {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String libraryId;
	private String libraryTitle;
	private String libraryUploadType;
	private String libraryImage;
	

}
