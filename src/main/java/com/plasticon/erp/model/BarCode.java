package com.plasticon.erp.model;
import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.Data;


@Entity
@Data
@Table(name="bar_code")
public class BarCode {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int barId;
	private String selectBook;
	private int accessionNo;
	private Date fromDate;
	private Date toDate;
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="fk_barId")
	private AddBook addbook;
}
