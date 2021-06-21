package com.plasticon.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.GetClassFeeStructure;
@Repository
public interface GetClassFeeStructureRepository extends JpaRepository<GetClassFeeStructure, Number> {

}
