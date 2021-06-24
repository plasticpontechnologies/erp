package com.plasticon.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.ModifyStaffDocumentDetails;

@Repository
public interface ModifyStaffDocumentRepository extends JpaRepository<ModifyStaffDocumentDetails,Number> {

}
