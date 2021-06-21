package com.plasticon.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.RevertTransaction;
@Repository
public interface RevertTransactionRepository extends JpaRepository<RevertTransaction,Integer>{

}
