package com.plasticon.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.SetupTermsDateDetails;

@Repository
public interface SetupTermsDateRepository extends JpaRepository<SetupTermsDateDetails,Number>{

}
