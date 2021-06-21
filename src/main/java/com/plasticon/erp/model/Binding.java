package com.plasticon.erp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="nature_binding")
public class Binding {
	
	@Id
    private int biId;
    private String natureOfBinding;
    
    
	
}
