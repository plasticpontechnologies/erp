package com.plasticon.erp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.QuestionsBank;


@Repository

public interface QuestionsBankRepository extends JpaRepository<QuestionsBank, Number>{
	
	  @Query("SELECT q FROM QuestionsBank q WHERE q.subs.SubId = :suId")
	  List<QuestionsBank> findBySubId(int suId);
	 

}
