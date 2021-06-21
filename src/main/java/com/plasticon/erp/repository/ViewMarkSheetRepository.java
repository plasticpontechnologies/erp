package com.plasticon.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.ViewMarkSheetDetails;

@Repository
public interface ViewMarkSheetRepository extends JpaRepository<ViewMarkSheetDetails,Number> {

}
