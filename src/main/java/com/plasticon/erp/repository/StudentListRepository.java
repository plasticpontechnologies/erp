package com.plasticon.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.StudentList;

@Repository
public interface StudentListRepository extends JpaRepository<StudentList, Number>{

}
