package com.plasticon.erp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.plasticon.erp.model.Subjects;


public interface SubjectRepository extends JpaRepository<Subjects,Number> {
	
	
	 @Query("SELECT s FROM Subjects s WHERE s.clas.clId = :clsId")
	 List<Subjects> findAllActiveUsers(int clsId);
	

}
