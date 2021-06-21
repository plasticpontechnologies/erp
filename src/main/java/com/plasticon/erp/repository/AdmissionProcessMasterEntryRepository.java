package com.plasticon.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.AdmissionProcessMasterEntry;
@Repository
public interface AdmissionProcessMasterEntryRepository extends JpaRepository<AdmissionProcessMasterEntry,Number> {

}
