package com.plasticon.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.RecordIncome;
@Repository
public interface RecordIncomeRepository extends JpaRepository<RecordIncome,Integer>{

}
