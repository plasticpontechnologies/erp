package com.plasticon.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.ViewStudents;

@Repository
public interface ViewStudentsRepository extends JpaRepository<ViewStudents, Number>{

}
