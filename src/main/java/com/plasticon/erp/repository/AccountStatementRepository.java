package com.plasticon.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.AccountStatement;

@Repository
public interface AccountStatementRepository extends JpaRepository<AccountStatement,Number>{

}
