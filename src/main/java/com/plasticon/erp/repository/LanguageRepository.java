package com.plasticon.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.Language;
@Repository
public interface LanguageRepository extends JpaRepository<Language,Number> {

}
