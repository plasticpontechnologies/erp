package com.plasticon.erp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.SectionDetails;



@Repository
public interface SectionRepository extends JpaRepository<SectionDetails,Number> {
	 @Query("SELECT sec FROM SectionDetails sec WHERE sec.cl.clId = :clId")
	 List<SectionDetails> findSectionsById(int clId);

}