package com.plasticon.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.StudentFeeRegister;
@Repository
public interface StudentFeeRegisterRepository extends JpaRepository<StudentFeeRegister, Number> {

}
