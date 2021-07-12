package com.plasticon.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.PenaltyMasterEntry;
@Repository
public interface PenaltyMasterEntryRepository extends JpaRepository<PenaltyMasterEntry, Number> {

}
