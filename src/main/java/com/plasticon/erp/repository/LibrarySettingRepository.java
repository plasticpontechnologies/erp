package com.plasticon.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.LibrarySetting;

@Repository
public interface LibrarySettingRepository extends JpaRepository<LibrarySetting,Integer> {

}
