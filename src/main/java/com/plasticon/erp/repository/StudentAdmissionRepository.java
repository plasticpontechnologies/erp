package com.plasticon.erp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.StudentAdmission;
@Repository
public interface StudentAdmissionRepository extends JpaRepository<StudentAdmission,Number> {
	
	@Query("Select s from StudentAdmission s where s.clasde.clId = :clasId")
	public List<StudentAdmission> findByClassId(int clasId);

}
