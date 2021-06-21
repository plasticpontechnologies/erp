package com.plasticon.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.ViewSyllabus;

@Repository
public interface ViewSyllabusRepository extends JpaRepository<ViewSyllabus, Number>{

}
