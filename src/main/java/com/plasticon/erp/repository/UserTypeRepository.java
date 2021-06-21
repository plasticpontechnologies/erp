package com.plasticon.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.UserType;
@Repository
public interface UserTypeRepository extends JpaRepository<UserType,Number> {

}
