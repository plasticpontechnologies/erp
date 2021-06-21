package com.plasticon.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.StartAdmission;
@Repository
public interface StartAdmissionRepository extends JpaRepository<StartAdmission,Number> {

}
