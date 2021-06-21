package com.plasticon.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.SetupMarkSheetDetails;

@Repository
public interface SetupMarkSheetRepository extends JpaRepository<SetupMarkSheetDetails,Number> {

}
