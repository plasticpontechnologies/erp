package com.plasticon.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.UserDetails;



@Repository
public interface UserRepository extends JpaRepository<UserDetails,Number> {

}
