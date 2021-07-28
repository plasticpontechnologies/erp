package com.plasticon.erp.model;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;


@Entity
@Data
@Table(name="addelective")
public class AddElective {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int addId;
	private String selectClass;
	private String subject;
	private String student;
	
	@JsonIgnore
	@OneToOne(targetEntity = ClassDetails.class)
	private List<ClassDetails> clas;
	
}
