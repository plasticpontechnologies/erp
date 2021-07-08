package com.plasticon.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.AddExamEntryPermission;

@Repository
public interface AddExamEntryPermissionRepository extends JpaRepository<AddExamEntryPermission, Number> {

}
