package com.plasticon.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plasticon.erp.model.OnlineExamTopic;

@Repository
public interface OnlineExamTopicRepository extends JpaRepository<OnlineExamTopic, Number> {

}
