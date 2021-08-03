package com.plasticon.erp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.MenuDetails;

@Repository
public interface MenuRepository extends JpaRepository<MenuDetails,Number> {

	  @Query("SELECT t FROM MenuDetails t where t.menuName = :mName") 
	    List<MenuDetails> findDishesByMenuName(@Param("mName") String mName);
}
