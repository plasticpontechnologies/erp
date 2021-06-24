package com.plasticon.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.SendSmsToClassWise;

@Repository
public interface ClassWiseRepository extends JpaRepository<SendSmsToClassWise,Integer> {

}
