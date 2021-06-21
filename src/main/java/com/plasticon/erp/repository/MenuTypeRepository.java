package com.plasticon.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.MenuTypeDetails;
@Repository
public interface MenuTypeRepository extends JpaRepository<MenuTypeDetails, Number> {

}
