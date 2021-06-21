package com.plasticon.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.QuestionBank;

@Repository
public interface QuestionBankRepository extends JpaRepository<QuestionBank, Number> {

}
