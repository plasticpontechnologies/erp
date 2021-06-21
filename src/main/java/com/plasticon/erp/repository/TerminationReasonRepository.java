package com.plasticon.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.TerminationReason;

@Repository
public interface TerminationReasonRepository extends JpaRepository<TerminationReason, Number>{

}
