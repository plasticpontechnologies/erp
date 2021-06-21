package com.plasticon.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.ViewPenalty;
@Repository

public interface ViewPenaltyRepository extends JpaRepository<ViewPenalty,Number> {

}
