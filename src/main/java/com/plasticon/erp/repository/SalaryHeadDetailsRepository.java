package com.plasticon.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.SalaryHeadDetails;
@Repository
public interface SalaryHeadDetailsRepository extends JpaRepository<SalaryHeadDetails,Integer>{

}
