package com.plasticon.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.DefineShiftDetails;

@Repository
public interface DefineShiftRepository extends JpaRepository<DefineShiftDetails,Number> {

}
