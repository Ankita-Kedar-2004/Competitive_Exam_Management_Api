package com.competitive_exam_management.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.competitive_exam_management.Entity.StudentEntity;

public interface StudentRepository extends JpaRepository<StudentEntity, Integer> {
    
}
