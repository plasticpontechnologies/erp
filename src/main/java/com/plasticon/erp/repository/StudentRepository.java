package com.plasticon.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.StudentDetails;
@Repository
public interface StudentRepository extends JpaRepository<StudentDetails,String> {

	

}
