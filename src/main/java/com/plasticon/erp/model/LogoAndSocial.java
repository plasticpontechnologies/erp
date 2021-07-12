package com.plasticon.erp.model;

import java.sql.Blob;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="logo_social")
public class LogoAndSocial {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int slno;
	private Blob logo;
	private Blob schoolImage;
	private String aboutUs;
	private String websiteAddress;
	private String facebookPageId;
	private String youtubePageId;
	private String linkednPageId;
	private String appLink;
	

}
