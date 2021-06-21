package com.plasticon.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.CanteenMasterEntry;
@Repository
public interface CanteenRepository extends JpaRepository<CanteenMasterEntry,Number>{

}
