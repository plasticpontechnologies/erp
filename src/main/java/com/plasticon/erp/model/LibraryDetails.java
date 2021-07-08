package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "library_info")
public class LibraryDetails {
	@Id
	private String libraryId;
	private String libraryTitle;
	private String libraryUploadType;
	private String libraryImage;
	

}
