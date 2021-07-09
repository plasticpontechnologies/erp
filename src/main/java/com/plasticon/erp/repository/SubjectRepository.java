package com.plasticon.erp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.plasticon.erp.model.SubjectDetails;


public interface SubjectRepository extends JpaRepository<SubjectDetails,Number> {
	
	
	 @Query("SELECT s FROM Subjects s WHERE s.clas.clId = :clsId")
	 List<SubjectDetails> findAllActiveUsers(int clsId);
	

}
