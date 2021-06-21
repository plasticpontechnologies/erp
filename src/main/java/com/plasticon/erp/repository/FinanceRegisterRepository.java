package com.plasticon.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.FinanceRegister;

@Repository
public interface FinanceRegisterRepository extends JpaRepository<FinanceRegister,Integer>{

}
