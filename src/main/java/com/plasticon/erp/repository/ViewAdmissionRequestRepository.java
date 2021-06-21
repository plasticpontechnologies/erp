package com.plasticon.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.ViewAdmissionRequest;
@Repository
public interface ViewAdmissionRequestRepository extends JpaRepository<ViewAdmissionRequest,Number>{

}
