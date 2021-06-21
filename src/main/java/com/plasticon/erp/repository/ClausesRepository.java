package com.plasticon.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.ClausesDetails;
@Repository
public interface ClausesRepository extends JpaRepository<ClausesDetails,Number>{

}
