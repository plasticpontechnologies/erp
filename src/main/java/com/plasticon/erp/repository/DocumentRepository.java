package com.plasticon.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.Document;

@Repository
public interface DocumentRepository extends JpaRepository<Document, Number>{

}
