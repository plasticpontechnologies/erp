package com.plasticon.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.FileModel;

@Repository

public interface DBFileRepository extends JpaRepository<FileModel, Integer> {

}
