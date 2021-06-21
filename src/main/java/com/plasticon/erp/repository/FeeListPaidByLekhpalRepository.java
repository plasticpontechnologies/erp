package com.plasticon.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.FeeListPaidByLekhpal;
@Repository
public interface FeeListPaidByLekhpalRepository extends JpaRepository<FeeListPaidByLekhpal, Number> {

}
