package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Entity
@Data
@Table(name="FILE_DB")
public class FileModel {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int fileId;
	private String fileName;
	//private String fileType;

	@Lob
	private byte[] data;


}
