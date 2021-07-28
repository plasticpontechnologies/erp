package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


import lombok.Data;
@Entity
@Data
@Table(name="class_images")
public class ClassWiseImages {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int clImageId;
private String title;
@Lob
private byte[] img;


  @ManyToOne()
  @JoinColumn(name="cliId")
  private ClassDetails climg;
 
 
}
