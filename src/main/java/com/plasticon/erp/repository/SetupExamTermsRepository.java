package com.plasticon.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.SetupExamTermsDetails;

@Repository
public interface SetupExamTermsRepository extends JpaRepository<SetupExamTermsDetails,Number> {

}
