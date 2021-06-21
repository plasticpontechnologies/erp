package com.plasticon.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.SetFeeStructure;
@Repository
public interface SetFeeStructureRepository extends JpaRepository<SetFeeStructure, Number> {

}
