package com.plasticon.erp.model;

import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

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
