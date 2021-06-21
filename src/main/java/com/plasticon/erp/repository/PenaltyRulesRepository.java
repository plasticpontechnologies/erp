package com.plasticon.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.PenaltyRules;
@Repository
public interface PenaltyRulesRepository extends JpaRepository<PenaltyRules, Number> {

}
