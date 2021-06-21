package com.plasticon.erp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.StaffDocumentDetails;
@Repository
public interface StaffDocumentRepository extends JpaRepository<StaffDocumentDetails,Number>{

	
}
