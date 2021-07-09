package com.plasticon.erp.model;

import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;


@Entity
@Data
@Table(name = "classes")


public class classes {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	
	private int clId;
	private String className;
	
	@JsonIgnore
	@OneToMany(targetEntity = Subjects.class)
	private List<Subjects> sub;
	
	@JsonIgnore
	@OneToMany(targetEntity = SectionDetails.class)
	private Set<SectionDetails> sec;


}
