package com.plasticon.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.UserPermissionUserType;

@Repository
public interface UserPermissionUserTypeRepository extends JpaRepository<UserPermissionUserType, Number> {

}
