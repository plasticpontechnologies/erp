package com.plasticon.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.ModifyStaffQualificationDetails;

@Repository
public interface ModifyStaffQualificationRepository extends JpaRepository<ModifyStaffQualificationDetails,Number>{

}
