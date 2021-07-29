package com.plasticon.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.SmsToRoute;

@Repository
public interface RouteRepository extends JpaRepository<SmsToRoute,Integer> {

	
	
}
