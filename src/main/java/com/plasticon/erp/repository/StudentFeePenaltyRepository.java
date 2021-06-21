package com.plasticon.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.StudentFeePenalty;
@Repository
public interface StudentFeePenaltyRepository extends JpaRepository<StudentFeePenalty, Number>{

}
