package com.plasticon.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.LanguageTranslate;
@Repository
public interface LanguageTranslateRepository extends JpaRepository<LanguageTranslate,Number>{

}
