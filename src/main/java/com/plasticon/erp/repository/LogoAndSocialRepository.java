package com.plasticon.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.LogoAndSocial;

@Repository
public interface LogoAndSocialRepository extends JpaRepository<LogoAndSocial, Number> {

}
