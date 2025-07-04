package com.competitive_exam_management.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.competitive_exam_management.Entity.QuestionsEntity;

@Repository
public interface QuestionsRepository extends JpaRepository<QuestionsEntity, Integer>{


}
