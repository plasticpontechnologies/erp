package com.plasticon.erp.model;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "setupmarks_sheet_details")
public class SetupMarkSheetDetails {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int markSheetId;
	private String logo;
	private String otherLogo;
	private String schoolNumber;
	private String schoolName;
	private String logoAlign;
	private String address;
	private String registrationNumber;
	private String academicSession;
	private String markSheetHeading;
	private String studentProfileHead;
	private String studentProfilePic;
	private String schoolCentreName;
	private String scholasticAreaHead;
	private String subjectHeading;
	private String showSubject;
	private String showTermTotal;
	private String showTermGrade;
	private String showOverAllTermTotal;
	private String showOverAllTermGrade;
	private String calculateWeightage;
	private String showMarks;
	private String showMaxMarks;
	private String coSAHeading;
	private String coScholasticArea;
	private String multiplePage;
	private String attandance;
	private String health;
	private String schoolImage;
	private String blackAndWhite;
	private String fullMarkSheetBold;
	private String remarks;
	private String showinGradingScale;
	private String showCoSGScale;
	private String backgroundImage;
	private String showfinalGrade;
	private String showGTFinal;
	private String showGrandTotalword;	 
	private String ShowFinalResult;
	private String allFinalMarks;
	private String principalSignature;
	private String teacherSignature;
	private String parentSignature;
	private String comupergenerateMsg;
	private String chooseOtherLogo;
	private String choosebackgroundImage;
	

}
