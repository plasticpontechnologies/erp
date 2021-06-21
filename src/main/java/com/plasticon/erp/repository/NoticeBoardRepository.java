package com.plasticon.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.NoticeBoard;

@Repository
public interface  NoticeBoardRepository extends JpaRepository<NoticeBoard,Number>{

}
