package com.plasticon.erp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.UserDetails;



@Repository
public interface UserRepository extends JpaRepository<UserDetails,Number> {
	List<UserDetails> findByUserNameAndUserPassword(String userName,String userPassword);
}
