package com.plasticon.erp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.SurveyInformation;

@Repository
public interface SurveyRepository extends JpaRepository<SurveyInformation,Integer> {

	// void deleteById(int id);

// 	List<SurveyInformation> findAll();

}
