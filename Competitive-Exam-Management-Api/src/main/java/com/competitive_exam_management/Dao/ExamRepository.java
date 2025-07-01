package com.competitive_exam_management.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.competitive_exam_management.Entity.ExamEntity;

@Repository
public interface ExamRepository extends JpaRepository<ExamEntity, Integer>{

}
