package com.plasticon.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.SetInstituteDetails;

@Repository
public interface SetInstituteDetailsRepository extends JpaRepository<SetInstituteDetails, Number> {

}
