package com.plasticon.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.FeesDueForEntireFamily;

@Repository
public interface FeesDueForEntireFamilyRepository extends JpaRepository<FeesDueForEntireFamily, Number> {

}
