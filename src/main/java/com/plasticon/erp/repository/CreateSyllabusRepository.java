package com.plasticon.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.CreateSyllabus;

@Repository
public interface CreateSyllabusRepository extends JpaRepository<CreateSyllabus, Number>{

}
